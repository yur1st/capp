package com.capp.tech.model.dto.revision;

import com.capp.tech.model.dto.DeviceDto;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DeviceRevisionDto extends DeviceDto {

    private LocalDateTime revisionDateTime;
    private Integer revisionNumber;
}
