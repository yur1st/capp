package com.capp.tech.controller;

import com.capp.tech.model.dto.UserDto;
import com.capp.tech.model.dto.revision.UserRevisionDto;
import com.capp.tech.model.entity.User;
import com.capp.tech.services.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user/")
public class UserController extends AbstractController<User, UserDto, UserRevisionDto,
        UserService> {

    public UserController(UserService service) {
        super(service);
    }
}
