package com.capp.tech.model.entity;

import javax.persistence.*;
import java.io.Serializable;

@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Attribute")
public class Attribute implements Serializable {

	public Attribute() {
	}

	@Column(name="Attribute_id", nullable=false, length=10)
	@Id
	@GeneratedValue(generator="ATTRIBUTE_ATTRIBUTE_ID_GENERATOR")
	@org.hibernate.annotations.GenericGenerator(name="ATTRIBUTE_ATTRIBUTE_ID_GENERATOR", strategy="native")
	private int attribute_id;
	
	@Column(name="Attribute_name", nullable=false, length=255)	
	private String attribute_name;
	
	@Column(name="Attribute_isInfluenceCT", nullable=false)	
	private boolean attribute_isInfluenceCT;
	
	@ManyToOne(targetEntity= AttributeLimitSet.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AttributeLimitSet_id", referencedColumnName="AttributeLimitSet_id", nullable=false) }, foreignKey=@ForeignKey(name="FKAttribute129513"))	
	private AttributeLimitSet attributeLimitSetAttributeLimitSet;
	
	@ManyToOne(targetEntity= AttributeLimitRange.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AttributeLimitRange_id", referencedColumnName="AttributeLimitRange_id", nullable=false) }, foreignKey=@ForeignKey(name="FKAttribute476832"))	
	private AttributeLimitRange attributeLimitRangeAttributeLimitRange;
	
	@ManyToOne(targetEntity= AttributeType.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AttributeType_id", referencedColumnName="AttributeType_id", nullable=false) }, foreignKey=@ForeignKey(name="FKAttribute390772"))	
	private AttributeType attributeTypeAttributeType;
	
	@ManyToOne(targetEntity= Unit.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="Unit_id", referencedColumnName="Unit_id", nullable=false) }, foreignKey=@ForeignKey(name="FKAttribute984364"))	
	private Unit unit;

}
