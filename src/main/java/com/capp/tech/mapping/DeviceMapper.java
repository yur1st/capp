package com.capp.tech.mapping;

import com.capp.tech.model.dto.DeviceDto;
import com.capp.tech.model.dto.revision.DeviceRevisionDto;
import com.capp.tech.model.entity.Device;
import org.mapstruct.Mapper;

@Mapper(config = CommonMapper.class)
public interface DeviceMapper extends CommonMapper<Device, DeviceDto, DeviceRevisionDto> {
}
