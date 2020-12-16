package com.capp.tech.mapping;

import com.capp.tech.model.dto.RoleDto;
import com.capp.tech.model.dto.revision.RoleRevisionDto;
import com.capp.tech.model.entity.Role;
import org.mapstruct.Mapper;

@Mapper(config = CommonMapper.class)
public interface RoleMapper extends CommonMapper<Role, RoleDto, RoleRevisionDto> {
}
