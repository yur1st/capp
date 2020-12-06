package com.capp.tech.guy;

import com.capp.tech.guy.map.Guy;

public interface GuyService extends CrudService<Guy, Long> {

    Guy findByLastName(String lastName);
}
