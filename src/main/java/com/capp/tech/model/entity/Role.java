package com.capp.tech.model.entity;

import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.OrderBy;

@Entity
@Data
@Audited
public class Role extends BaseEntity {

    @OrderBy
    private String value;
    private String name;

}
