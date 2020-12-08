package com.capp.tech.model.entity;

import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "Unit")
@Table(name = "unit")
@Data
@Audited
public class Unit extends BaseEntity {

    private String name;

    private String units;

    @OneToOne
    @JoinColumn(name = "attribute_id")
    private Attribute attribute;

}
