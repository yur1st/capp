package com.capp.tech.services;

import com.capp.tech.model.entity.User;
import com.capp.tech.repository.datajpa.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractService<User, UserRepository> {

    public UserService(UserRepository repository) {
        super(repository);
    }
}
