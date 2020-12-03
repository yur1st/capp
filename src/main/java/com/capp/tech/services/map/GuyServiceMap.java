package com.capp.tech.services.map;

import com.capp.tech.model.Guy;
import com.capp.tech.services.GuyService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class GuyServiceMap extends AbstractMapService<Guy, Long> implements GuyService {
    @Override
    public Guy findByLastName(String lastName) {
        return null;
    }

    @Override
    public Set<Guy> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Guy object) {

    }

    @Override
    public Guy save(Guy object) {
        return super.save(object);
    }

    @Override
    public Guy findById(Long id) {
        return super.findById(id);
    }
}
