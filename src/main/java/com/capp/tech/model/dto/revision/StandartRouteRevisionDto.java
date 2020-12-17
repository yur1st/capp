package com.capp.tech.model.dto.revision;

import com.capp.tech.model.dto.StandartRouteDto;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class StandartRouteRevisionDto extends StandartRouteDto {
    private LocalDateTime revisionDateTime;
    private Integer revisionNumber;
}
