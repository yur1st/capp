package com.capp.tech.model.graphql;

import com.capp.tech.model.dto.RoleDto;
import com.capp.tech.model.dto.UserDto;
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

    public UserDto createUser(final String firstName, final String lastName, final String email, final Set<String> roles, final boolean isActive) {
        LinkedHashSet<RoleDto> roleSet = new LinkedHashSet<>();
        roles.forEach(id -> roleSet.add(roleService.findById(Long.parseLong(id))));

        UserDto userDto = new UserDto();
        userDto.setFirstName(firstName);
        userDto.setLastName(lastName);
        userDto.setEmail(email);
        userDto.setRoles(roleSet);
        userDto.setActive(isActive);
        return userService.save(userDto);

    }
}
