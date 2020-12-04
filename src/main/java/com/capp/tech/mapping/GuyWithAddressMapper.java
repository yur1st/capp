package com.capp.tech.mapping;

import com.capp.tech.model.dto.GuyWithAddressDTO;
import com.capp.tech.model.entity.Address;
import com.capp.tech.model.entity.Guy;
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
