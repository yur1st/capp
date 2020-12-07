package com.capp.tech.model.entity;

import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "AttributeLimitRange")
@Table(name = "attribute_limit_range")
@Audited
@Data
public class AttributeLimitRange extends BaseEntity {

    private double min;

    private double max;

}
