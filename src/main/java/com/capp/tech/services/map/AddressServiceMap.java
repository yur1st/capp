package com.capp.tech.services.map;

import com.capp.tech.model.entity.Address;
import com.capp.tech.services.AddressService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AddressServiceMap extends AbstractMapService<Address, Long> implements AddressService {

    @Override
    public Set<Address> findAll() {
        return super.findAll();
    }

    @Override
    public Address findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Address save(Address object) {
        return super.save(object);
    }

    @Override
    public void delete(Address object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
