package com.capp.tech.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Unit")
@Table(name = "unit")
@Data
public class Unit extends BaseEntity {

    private String name;

    private String units;

}
