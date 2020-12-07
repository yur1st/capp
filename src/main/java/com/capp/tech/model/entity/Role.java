package com.capp.tech.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Role {

    @Id
    @GeneratedValue
    private Long id;

    private String value;
    private String name;


}
