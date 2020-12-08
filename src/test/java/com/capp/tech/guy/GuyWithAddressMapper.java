package com.capp.tech.guy;

import com.capp.tech.guy.map.Address;
import com.capp.tech.guy.map.Guy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedSourcePolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface GuyWithAddressMapper {

    @Mapping(source = "guy.id", target = "guyId")
    @Mapping(source = "address.id", target = "addressId")
    @Mapping(source = "guy.name", target = "firstName")
    @Mapping(source = "guy.lastName", target = "lastName")
    @Mapping(source = "address.city", target = "town")
    GuyWithAddressDTO guyAndAddressToGuyWithAddressDTO(Guy guy, Address address);

}
