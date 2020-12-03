package com.capp.tech.mapping;

import com.capp.tech.model.dto.GuyWithAddressDTO;
import com.capp.tech.model.entity.Address;
import com.capp.tech.model.entity.Guy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import java.util.Set;

@Mapper
@Component
public abstract class GuyWithAddressMapper {

    @Mapping(source = "guy.id", target = "guyId")
    @Mapping(source = "address.id", target = "addressId")
    @Mapping(source = "guy.name", target = "firstName")
    @Mapping(source = "guy.lastName", target = "lastName")
    @Mapping(source = "address.city", target = "town")
    public abstract GuyWithAddressDTO guyAndAddressToGuyWithAddressDTO(Guy guy, Address address);

    @Mapping(source = "guy.id", target = "guyId")
    @Mapping(source = "address.id", target = "addressId")
    @Mapping(source = "guy.name", target = "firstName")
    @Mapping(source = "guy.lastName", target = "lastName")
    @Mapping(source = "address.city", target = "town")
    public abstract Set<GuyWithAddressDTO> guyAndAddressToGuyWithAddressDTOs(Set<Guy> guy, Set<Address> address);
    //TODO Error:(30, 44) java: The return type Set<GuyWithAddressDTO> is an abstract class or interface. Provide a non abstract / non interface result type or a factory method.



}
