package com.capp.tech.model.entity;

import javax.persistence.*;
import java.io.Serializable;

@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="AttributeSet")
public class AttributeSet implements Serializable {
	public AttributeSet() {
	}

    @Column(name="AttributeSet_id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="ATTRIBUTESET_ATTRIBUTESET_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ATTRIBUTESET_ATTRIBUTESET_ID_GENERATOR", strategy="native")	
	private int attributeSet_id;
	
	@Column(name="AttributeSet_Keys", nullable=false, unique=true, length=65536)	
	private String attributeSet_Keys;
	
	@OneToMany(mappedBy="attributeSetAttributeSet", targetEntity= StandartOperation.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_standartOperation = new java.util.HashSet();

    //@Transient
	//public final StandartOperationSetCollection standartOperation = new StandartOperationSetCollection(this, _ormAdapter, ORMConstants.KEY_ATTRIBUTESET_STANDARTOPERATION, ORMConstants.KEY_STANDARTOPERATION_ATTRIBUTESETATTRIBUTESET, ORMConstants.KEY_MUL_ONE_TO_MANY);

}
