package com.capp.tech.guy;

import com.capp.tech.guy.map.Address;
import com.capp.tech.guy.map.Guy;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
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
        final Iterable<Guy> guys = guyService.findAll();
        final Iterable<Address> addresses = addressService.findAll();
        /*
        for (Guy guy : guys) {
            guyWithAddressDTOs.add(mapper.guyAndAddressToGuyWithAddressDTO(guy, addresses. get(guy.getId().intValue()-1)));
        }
        */
        return new ResponseEntity<>(guyWithAddressDTOs, HttpStatus.OK);

    }

    @RequestMapping(value = "/api/gwa/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GuyWithAddressDTO> guysWithAddressById(@PathVariable Long id) {

        final GuyWithAddressDTO guyWithAddressDTO = mapper.guyAndAddressToGuyWithAddressDTO(guyService.findById(id), addressService.findById(id));

        return new ResponseEntity<>(guyWithAddressDTO, HttpStatus.OK);

    }

}
