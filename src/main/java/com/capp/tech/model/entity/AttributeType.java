package com.capp.tech.model.entity;

import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "AttributeType")
@Table(name = "attribute_type")
@Data
@Audited
public class AttributeType extends BaseEntity {

    @OneToOne
    @JoinColumn(name = "attribute_id")
    private Attribute attribute;

    private String name;

}
