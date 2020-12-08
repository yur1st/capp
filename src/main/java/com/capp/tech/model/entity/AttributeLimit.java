package com.capp.tech.model.entity;

import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "AttributeLimit")
@Table(name = "attribute_limit")
@Data
@Audited
public class AttributeLimit extends BaseEntity {

    private String possibleValue;

    @ManyToOne
    @JoinColumn(name = "attribute_id")
    private Attribute attribute;

}
