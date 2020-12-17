package com.capp.tech.controller;

import com.capp.tech.model.dto.DeviceDto;
import com.capp.tech.model.dto.revision.DeviceRevisionDto;
import com.capp.tech.model.entity.Device;
import com.capp.tech.services.DeviceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/device")
public class DeviceController extends AbstractController<Device, DeviceDto, DeviceRevisionDto, DeviceService> {

    public DeviceController(DeviceService service) {
        super(service);
    }
}
