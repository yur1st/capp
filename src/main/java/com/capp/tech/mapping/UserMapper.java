package com.capp.tech.mapping;

import com.capp.tech.model.dto.UserDto;
import com.capp.tech.model.dto.revision.UserRevisionDto;
import com.capp.tech.model.entity.User;
import org.mapstruct.Mapper;

@Mapper(config = CommonMapper.class)
public interface UserMapper extends CommonMapper<User, UserDto, UserRevisionDto> {

}
