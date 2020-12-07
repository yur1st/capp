package com.capp.tech.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "AttributeType")
@Table(name = "attribute_type")
@Data
public class AttributeType extends BaseEntity {

    private String attributType_name;

}
