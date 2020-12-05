package com.capp.tech.model.entity;

import javax.persistence.*;
import java.io.Serializable;


@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="AttributeLimitRange")
public class AttributeLimitRange implements Serializable {

    @Column(name="AttributeLimitRange_id", nullable=false, length=10)
	@Id	
	@GeneratedValue(generator="ATTRIBUTELIMITRANGE_ATTRIBUTELIMITRANGE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ATTRIBUTELIMITRANGE_ATTRIBUTELIMITRANGE_ID_GENERATOR", strategy="native")	
	private int attributeLimitRange_id;
	
	@Column(name="AttributLimitRange_min", nullable=false, length=10)	
	private float attributLimitRange_min;
	
	@Column(name="AttributLimitRange_max", nullable=false, length=10)	
	private float attributLimitRange_max;
	
	@OneToMany(mappedBy="attributeLimitRangeAttributeLimitRange", targetEntity=Attribute.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_attribute = new java.util.HashSet();

    //@Transient
	//public final AttributeSetCollection attribute = new AttributeSetCollection(this, _ormAdapter, ORMConstants.KEY_ATTRIBUTELIMITRANGE_ATTRIBUTE, ORMConstants.KEY_ATTRIBUTE_ATTRIBUTELIMITRANGEATTRIBUTELIMITRANGE, ORMConstants.KEY_MUL_ONE_TO_MANY);

}
