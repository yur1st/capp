package com.capp.tech.model.dto.revision;

import com.capp.tech.model.dto.RouteStatusDto;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RouteStatusRevisionDto extends RouteStatusDto {

    private LocalDateTime revisionDateTime;
    private Integer revisionNumber;
}
