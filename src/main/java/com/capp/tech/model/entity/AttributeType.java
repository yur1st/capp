package com.capp.tech.model.entity;

import javax.persistence.*;
import java.io.Serializable;

@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="AttributeType")
public class AttributeType implements Serializable {
	public AttributeType() {
	}

    @Column(name="AttributeType_id", nullable=false, length=10)
	@Id
	@GeneratedValue(generator="ATTRIBUTETYPE_ATTRIBUTETYPE_ID_GENERATOR")
	@org.hibernate.annotations.GenericGenerator(name="ATTRIBUTETYPE_ATTRIBUTETYPE_ID_GENERATOR", strategy="native")	
	private int attributeType_id;
	
	@Column(name="AttributType_name", nullable=false, length=255)	
	private String attributType_name;
	
	@OneToMany(mappedBy="attributeTypeAttributeType", targetEntity=Attribute.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_attribute = new java.util.HashSet();

    //@Transient
	//public final AttributeSetCollection attribute = new AttributeSetCollection(this, _ormAdapter, ORMConstants.KEY_ATTRIBUTETYPE_ATTRIBUTE, ORMConstants.KEY_ATTRIBUTE_ATTRIBUTETYPEATTRIBUTETYPE, ORMConstants.KEY_MUL_ONE_TO_MANY);

}
