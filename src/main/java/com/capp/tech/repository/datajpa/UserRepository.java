package com.capp.tech.repository.datajpa;

import com.capp.tech.model.entity.User;

import java.util.Optional;

public interface UserRepository extends CommonRepository<User> {
    User findByUsername(String string);

    Optional<User> findByEmail(String s);
}
