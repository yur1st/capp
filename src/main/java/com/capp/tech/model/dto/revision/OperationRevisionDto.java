package com.capp.tech.model.dto.revision;

import com.capp.tech.model.dto.OperationDto;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OperationRevisionDto extends OperationDto {
    private LocalDateTime revisionDateTime;
    private Integer revisionNumber;
}
