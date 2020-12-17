package com.capp.tech.model.dto.revision;

import com.capp.tech.model.dto.OperationStatusDto;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OperationStatusRevisionDto extends OperationStatusDto {

    private LocalDateTime revisionDateTime;
    private Integer revisionNumber;
}
