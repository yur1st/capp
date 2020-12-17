package com.capp.tech.model.dto.revision;

import com.capp.tech.model.dto.WorkplaceDto;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class WorkplaceRevisionDto extends WorkplaceDto {

    private LocalDateTime revisionDateTime;
    private Integer revisionNumber;
}
