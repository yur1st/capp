package com.capp.tech.model.entity.ToImplement;

import com.capp.tech.model.entity.BaseEntity;

public class Guy extends BaseEntity {

    private String name;
    private String lastName;

    public Guy() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
