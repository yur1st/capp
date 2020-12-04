package com.capp.tech.controller;

import com.capp.tech.mapping.GuyWithAddressMapper;
import com.capp.tech.model.dto.GuyWithAddressDTO;
import com.capp.tech.model.entity.Address;
import com.capp.tech.model.entity.Guy;
import com.capp.tech.services.AddressService;
import com.capp.tech.services.GuyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
    public ResponseEntity<Set<GuyWithAddressDTO>> listGuysWithAddress() {

        final Set<GuyWithAddressDTO> guyWithAddressDTOs = new HashSet<>();
        final Set<Guy> guys = guyService.findAll();
        final List<Address> addresses = new ArrayList<>(addressService.findAll());
        for (Guy guy : guys) {
            guyWithAddressDTOs.add(mapper.guyAndAddressToGuyWithAddressDTO(guy, addresses.get(guy.getId().intValue()-1)));
        }

        return new ResponseEntity<>(guyWithAddressDTOs, HttpStatus.OK);

    }

    @RequestMapping(value = "/api/gwa/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GuyWithAddressDTO> guysWithAddressById(@PathVariable Long id) {

        final GuyWithAddressDTO guyWithAddressDTO = mapper.guyAndAddressToGuyWithAddressDTO(guyService.findById(id), addressService.findById(id));

        return new ResponseEntity<>(guyWithAddressDTO, HttpStatus.OK);

    }

}
