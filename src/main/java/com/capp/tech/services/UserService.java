package com.capp.tech.services;

import com.capp.tech.mapping.CommonMapper;
import com.capp.tech.model.dto.UserDto;
import com.capp.tech.model.dto.revision.UserRevisionDto;
import com.capp.tech.model.entity.User;
import com.capp.tech.repository.datajpa.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractService<User, UserRepository,
        UserDto, UserRevisionDto, CommonMapper<User, UserDto, UserRevisionDto>> {

    public UserService(UserRepository repository, CommonMapper<User, UserDto, UserRevisionDto> mapper) {
        super(repository, mapper);
    }
}
