package com.capp.tech.controller;

import com.capp.tech.mapping.GuyWithAddressMapper;
import com.capp.tech.model.dto.GuyWithAddressDTO;
import com.capp.tech.services.AddressService;
import com.capp.tech.services.GuyService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class GuyWithAddressController {

    private final GuyService guyService;
    private final AddressService addressService;
    private final GuyWithAddressMapper mapper;

    public GuyWithAddressController(GuyService guyService, AddressService addressService, GuyWithAddressMapper mapper) {
        this.guyService = guyService;
        this.addressService = addressService;
        this.mapper = mapper;
    }

    @RequestMapping(value = "/api/gwa", produces = MediaType.APPLICATION_JSON_VALUE)
    public Set<GuyWithAddressDTO> listGuysWithAddress() {

        return mapper.guyAndAddressToGuyWithAddressDTOs(guyService.findAll(), addressService.findAll());

    }

}
