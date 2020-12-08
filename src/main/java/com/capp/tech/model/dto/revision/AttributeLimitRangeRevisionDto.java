package com.capp.tech.model.dto.revision;

import com.capp.tech.model.dto.AttributeLimitRangeDto;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AttributeLimitRangeRevisionDto extends AttributeLimitRangeDto {

    private LocalDateTime revisionDateTime;
    private Integer revisionNumber;

}
