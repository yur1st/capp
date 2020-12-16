package com.capp.tech.model.dto.revision;

import com.capp.tech.model.dto.UserDto;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserRevisionDto extends UserDto {
    private LocalDateTime revisionDateTime;
    private Integer revisionNumber;
}
