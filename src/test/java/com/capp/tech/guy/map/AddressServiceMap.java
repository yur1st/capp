package com.capp.tech.guy.map;

import com.capp.tech.guy.AddressService;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceMap extends AbstractMapService<Address, Long> implements AddressService {

    @Override
    public Iterable<Address> findAll() {
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
