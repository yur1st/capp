package com.capp.tech.services;

import com.capp.tech.model.entity.Device;
import com.capp.tech.repository.datajpa.DeviceRepository;
import org.springframework.stereotype.Service;

@Service
public class DeviceService extends AbstractService<Device, DeviceRepository> {

    public DeviceService(DeviceRepository repository) {
        super(repository);
    }
}
