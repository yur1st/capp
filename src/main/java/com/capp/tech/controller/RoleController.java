package com.capp.tech.controller;

import com.capp.tech.model.dto.RoleDto;
import com.capp.tech.model.dto.revision.RoleRevisionDto;
import com.capp.tech.model.entity.Role;
import com.capp.tech.services.RoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/role")
public class RoleController extends AbstractController<Role, RoleDto, RoleRevisionDto,
        RoleService> {

    public RoleController(RoleService service) {
        super(service);
    }
}
