package com.capp.tech.model.graphql;

import com.capp.tech.model.entity.Role;
import com.capp.tech.model.entity.User;
import com.capp.tech.services.RoleService;
import com.capp.tech.services.UserService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

import java.util.LinkedHashSet;
import java.util.Set;

@Component
public class UserMutation implements GraphQLMutationResolver {

    private final UserService userService;
    private final RoleService roleService;

    public UserMutation(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
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
}
