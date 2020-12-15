package com.capp.tech.model.dto.revision;

import com.capp.tech.model.dto.RoleDto;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RoleRevisionDto extends RoleDto {
    private LocalDateTime revisionDateTime;
    private Integer revisionNumber;
}
