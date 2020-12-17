package com.capp.tech.model.dto.revision;

import com.capp.tech.model.dto.LineDto;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class LineRevisionDto extends LineDto {

    private LocalDateTime revisionDateTime;
    private Integer revisionNumber;
}
