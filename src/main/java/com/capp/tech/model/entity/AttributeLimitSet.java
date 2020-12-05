package com.capp.tech.model.entity;


import javax.persistence.*;
import java.io.Serializable;

@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="AttributeLimitSet")
public class AttributeLimitSet implements Serializable {
	public AttributeLimitSet() {
	}

    @Column(name="AttributeLimitSet_id", nullable=false, length=10)
	@Id
	@GeneratedValue(generator="ATTRIBUTELIMITSET_ATTRIBUTELIMITSET_ID_GENERATOR")
	@org.hibernate.annotations.GenericGenerator(name="ATTRIBUTELIMITSET_ATTRIBUTELIMITSET_ID_GENERATOR", strategy="native")	
	private int attributeLimitSet_id;
	
	@Column(name="AtributeLimitSet_set", nullable=false, length=255)	
	private String atributeLimitSet_set;
	
	@OneToMany(mappedBy="attributeLimitSetAttributeLimitSet", targetEntity=Attribute.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_attribute = new java.util.HashSet();

    //@Transient
	//public final AttributeSetCollection attribute = new AttributeSetCollection(this, _ormAdapter, ORMConstants.KEY_ATTRIBUTELIMITSET_ATTRIBUTE, ORMConstants.KEY_ATTRIBUTE_ATTRIBUTELIMITSETATTRIBUTELIMITSET, ORMConstants.KEY_MUL_ONE_TO_MANY);

}
