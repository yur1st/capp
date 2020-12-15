package com.capp.tech.model.dto;

import lombok.Data;

import java.util.Set;

@Data
public class UserDto extends BaseDto {

    private String firstName;
    private String lastName;
    private String email;
    private Set<RoleDto> roles;
}
