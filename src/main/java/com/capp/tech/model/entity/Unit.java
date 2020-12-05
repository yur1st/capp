package com.capp.tech.model.entity;

import javax.persistence.*;
import java.io.Serializable;

@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Unit")
public class Unit implements Serializable {
	public Unit() {
	}

    @Column(name="Unit_id", nullable=false, length=10)
	@Id	
	@GeneratedValue(generator="UNIT_UNIT_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="UNIT_UNIT_ID_GENERATOR", strategy="native")	
	private int unit_id;
	
	@Column(name="Unit_name", nullable=true, length=255)	
	private String unit_name;
	
	@Column(name="Unit_units", nullable=true, length=255)	
	private String unit_units;
	
	@OneToMany(mappedBy="unit", targetEntity=Attribute.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_attribute = new java.util.HashSet();

    //@Transient
	//public final AttributeSetCollection attribute = new AttributeSetCollection(this, _ormAdapter, ORMConstants.KEY_UNIT_ATTRIBUTE, ORMConstants.KEY_ATTRIBUTE_UNIT, ORMConstants.KEY_MUL_ONE_TO_MANY);

}
