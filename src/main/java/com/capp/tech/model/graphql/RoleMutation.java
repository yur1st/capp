package com.capp.tech.model.graphql;

import com.capp.tech.model.entity.Role;
import com.capp.tech.services.RoleService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class RoleMutation implements GraphQLMutationResolver {

    private final RoleService roleService;

    public RoleMutation(RoleService roleService) {
        this.roleService = roleService;
    }

    public Role createRole(final String name, final boolean isActive) {
        Role role = new Role();
        role.setName(name);
        role.setActive(isActive);
        return roleService.save(role);
    }
}
