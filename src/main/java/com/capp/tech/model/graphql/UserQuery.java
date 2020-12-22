package com.capp.tech.model.graphql;

import com.capp.tech.model.dto.UserDto;
import com.capp.tech.services.UserService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class UserQuery implements GraphQLQueryResolver {

    private final UserService userService;

    public UserQuery(UserService userService) {
        this.userService = userService;
    }

    public List<UserDto> getUsers() {
        return StreamSupport.stream(this.userService.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public UserDto getUser(final Long id) {
        return this.userService.findById(id);
    }

}
