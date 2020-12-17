package com.capp.tech.model.entity;

import lombok.Data;
import org.hibernate.annotations.Type;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "AttributeLimit")
@Table(name = "attribute_limit")
@Data
@Audited
public class AttributeLimit extends BaseEntity {

    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private Set<String> possibleValues = new HashSet<>();

    @OneToOne
    @JoinColumn(name = "attribute_id")
    private Attribute attribute;

}
