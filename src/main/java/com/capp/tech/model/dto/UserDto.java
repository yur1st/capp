package com.capp.tech.model.dto;

import lombok.Data;

import java.util.LinkedHashSet;
import java.util.Objects;

@Data
public class UserDto extends BaseDto {

    private String firstName;
    private String lastName;
    private String email;
    private LinkedHashSet<RoleDto> roles;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        UserDto dto = (UserDto) o;
        return Objects.equals(email, dto.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), email);
    }
}
