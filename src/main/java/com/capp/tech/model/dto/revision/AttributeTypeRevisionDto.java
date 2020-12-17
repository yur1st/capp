package com.capp.tech.model.dto.revision;

import com.capp.tech.model.dto.AttributeTypeDto;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AttributeTypeRevisionDto extends AttributeTypeDto {

    private LocalDateTime revisionDateTime;
    private Integer revisionNumber;
}
