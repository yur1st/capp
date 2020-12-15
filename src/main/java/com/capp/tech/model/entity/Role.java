package com.capp.tech.model.entity;

import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;

@Entity
@Data
@Audited
public class Role extends BaseEntity {

    private String value;
    private String name;

}
