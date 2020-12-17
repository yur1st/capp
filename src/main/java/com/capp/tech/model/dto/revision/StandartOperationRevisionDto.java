package com.capp.tech.model.dto.revision;

import com.capp.tech.model.dto.StandartOperationDto;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class StandartOperationRevisionDto extends StandartOperationDto {
    private LocalDateTime revisionDateTime;
    private Integer revisionNumber;
}
