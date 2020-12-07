package com.capp.tech.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "AttributeLimit")
@Table(name = "attribute_limit")
@Data
public class AttributeLimit extends BaseEntity {

    private String attributePossibleValue;

}
