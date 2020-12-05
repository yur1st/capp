package com.capp.tech.model.entity;

import javax.persistence.*;
import java.io.Serializable;

@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="StandartOperation")
public class StandartOperation implements Serializable {
	public StandartOperation() {
	}

    @Column(name="StandartOperation_id", nullable=false, length=10)
	@Id	
	@GeneratedValue(generator="STANDARTOPERATION_STANDARTOPERATION_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="STANDARTOPERATION_STANDARTOPERATION_ID_GENERATOR", strategy="native")	
	private int standartOperation_id;
	
	@Column(name="StandartOperation_name", nullable=false, length=255)	
	private String standartOperation_name;
	
	@ManyToOne(targetEntity=AttributeSet.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AttributeSet_id", referencedColumnName="AttributeSet_id", nullable=false) }, foreignKey=@ForeignKey(name="FKStandartOp131375"))	
	private AttributeSet attributeSetAttributeSet;
	
	@OneToMany(mappedBy="standartOperationStandartOperation", targetEntity= StandartRroute.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_standartRroute = new java.util.HashSet();
	
	@OneToMany(mappedBy="standartOperationStandartOperation", targetEntity=Operation.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_operation = new java.util.HashSet();

    //@Transient
	//public final StandartRrouteSetCollection standartRroute = new StandartRrouteSetCollection(this, _ormAdapter, ORMConstants.KEY_STANDARTOPERATION_STANDARTRROUTE, ORMConstants.KEY_STANDARTRROUTE_STANDARTOPERATIONSTANDARTOPERATION, ORMConstants.KEY_MUL_ONE_TO_MANY);

    //@Transient
	//public final OperationSetCollection operation = new OperationSetCollection(this, _ormAdapter, ORMConstants.KEY_STANDARTOPERATION_OPERATION, ORMConstants.KEY_OPERATION_STANDARTOPERATIONSTANDARTOPERATION, ORMConstants.KEY_MUL_ONE_TO_MANY);

}
