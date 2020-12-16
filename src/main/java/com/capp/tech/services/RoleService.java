package com.capp.tech.services;

import com.capp.tech.mapping.CommonMapper;
import com.capp.tech.model.dto.RoleDto;
import com.capp.tech.model.dto.revision.RoleRevisionDto;
import com.capp.tech.model.entity.Role;
import com.capp.tech.repository.datajpa.RoleRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleService extends AbstractService<Role, RoleRepository,
        RoleDto, RoleRevisionDto, CommonMapper<Role, RoleDto, RoleRevisionDto>> {

    public RoleService(RoleRepository repository, CommonMapper<Role, RoleDto, RoleRevisionDto> mapper) {
        super(repository, mapper);
    }
}
