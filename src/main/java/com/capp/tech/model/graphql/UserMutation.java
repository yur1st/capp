package com.capp.tech.model.graphql;

import com.capp.tech.model.entity.Role;
import com.capp.tech.model.entity.User;
import com.capp.tech.services.RoleService;
import com.capp.tech.services.UserService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.LinkedHashSet;
import java.util.Set;

@Component
public class UserMutation implements GraphQLMutationResolver {

    private final UserService userService;
    private final RoleService roleService;
    private final AuthenticationProvider authenticationProvider;

    public UserMutation(UserService userService, RoleService roleService, AuthenticationProvider authenticationProvider) {
        this.userService = userService;
        this.roleService = roleService;
        this.authenticationProvider = authenticationProvider;
    }

    public User createUser(final String firstName, final String lastName, final String email, final Set<String> roles, final boolean isActive) {
        LinkedHashSet<Role> roleSet = new LinkedHashSet<>();
        roles.forEach(id -> roleSet.add(roleService.findById(Long.parseLong(id))));

        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setRoles(roleSet);
        user.setActive(isActive);
        return userService.save(user);

    }

    @PreAuthorize("isAnonymous()")
    public User login(String email, String password) {
        UsernamePasswordAuthenticationToken credentials = new UsernamePasswordAuthenticationToken(email, password);
        try {
            SecurityContextHolder.getContext().setAuthentication(authenticationProvider.authenticate(credentials));
            return userService.getCurrentUser(email);
        } catch (AuthenticationException ex) {
            throw new BadCredentialsException(email);
        }
    }

}
