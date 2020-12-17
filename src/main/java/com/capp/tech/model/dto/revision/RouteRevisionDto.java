package com.capp.tech.model.dto.revision;

import com.capp.tech.model.dto.RouteDto;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RouteRevisionDto extends RouteDto {
    private LocalDateTime revisionDateTime;
    private Integer revisionNumber;
}
