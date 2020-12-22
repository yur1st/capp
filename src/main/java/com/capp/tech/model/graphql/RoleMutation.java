package com.capp.tech.model.graphql;

import com.capp.tech.model.dto.RoleDto;
import com.capp.tech.services.RoleService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class RoleMutation implements GraphQLMutationResolver {

    private final RoleService roleService;

    public RoleMutation(RoleService roleService) {
        this.roleService = roleService;
    }

    public RoleDto createRole(final String name, final boolean isActive) {
        RoleDto roleDto = new RoleDto();
        roleDto.setName(name);
        roleDto.setActive(isActive);
        return roleService.save(roleDto);
    }
}
