package com.capp.tech.services;

import com.capp.tech.model.Guy;

public interface GuyService extends CrudService<Guy, Long> {

    Guy findByLastName(String lastName);
}
