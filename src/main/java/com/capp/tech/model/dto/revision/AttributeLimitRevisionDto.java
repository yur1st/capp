package com.capp.tech.model.dto.revision;

import com.capp.tech.model.dto.AttributeLimitDto;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AttributeLimitRevisionDto extends AttributeLimitDto {
    private LocalDateTime revisionDateTime;
    private Integer revisionNumber;
}
