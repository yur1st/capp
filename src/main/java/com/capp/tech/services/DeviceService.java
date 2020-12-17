package com.capp.tech.services;

import com.capp.tech.mapping.CommonMapper;
import com.capp.tech.model.dto.DeviceDto;
import com.capp.tech.model.dto.revision.DeviceRevisionDto;
import com.capp.tech.model.entity.Device;
import com.capp.tech.repository.datajpa.DeviceRepository;
import org.springframework.stereotype.Service;

@Service
public class DeviceService extends AbstractService<Device, DeviceRepository,
        DeviceDto, DeviceRevisionDto, CommonMapper<Device, DeviceDto, DeviceRevisionDto>> {

    public DeviceService(DeviceRepository repository, CommonMapper<Device, DeviceDto, DeviceRevisionDto> mapper) {
        super(repository, mapper);
    }
}
