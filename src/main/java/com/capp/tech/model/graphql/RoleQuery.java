package com.capp.tech.model.graphql;

import com.capp.tech.model.dto.RoleDto;
import com.capp.tech.services.RoleService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class RoleQuery implements GraphQLQueryResolver {

    private final RoleService roleService;

    public RoleQuery(RoleService roleService) {
        this.roleService = roleService;
    }

    public List<RoleDto> getRoles() {
        return StreamSupport.stream(roleService.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public RoleDto getRole(final Long id) {
        return roleService.findById(id);
    }
}
