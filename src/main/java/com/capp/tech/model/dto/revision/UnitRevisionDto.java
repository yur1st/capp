package com.capp.tech.model.dto.revision;

import com.capp.tech.model.dto.UnitDto;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UnitRevisionDto extends UnitDto {
    private LocalDateTime revisionDateTime;
    private Integer revisionNumber;
}
