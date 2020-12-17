package com.capp.tech.model.dto.revision;

import com.capp.tech.model.dto.AttributeDto;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AttributeRevisionDto extends AttributeDto {
    private LocalDateTime revisionDateTime;
    private Integer revisionNumber;
}
