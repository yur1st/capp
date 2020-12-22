package com.capp.tech.services;

import com.capp.tech.model.entity.Role;
import com.capp.tech.repository.datajpa.RoleRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleService extends AbstractService<Role, RoleRepository> {

    public RoleService(RoleRepository repository) {
        super(repository);
    }
}
