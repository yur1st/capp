package com.capp.tech.model.dto;

import lombok.Data;

@Data
public class UserDto extends BaseDto {

    private String firstName;
    private String lastName;
    private String email;
}
