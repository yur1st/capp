package com.capp.tech.model.entity;

import javax.persistence.*;
import java.io.Serializable;

@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Operation")
public class Operation implements Serializable {
	public Operation() {
	}

    @Column(name="Operation_id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="OPERATION_OPERATION_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="OPERATION_OPERATION_ID_GENERATOR", strategy="native")	
	private int operation_id;
	
	@Column(name="Operation_CT", nullable=true, length=10)	
	private Float operation_CT;
	
	@Column(name="Operation_AttributeMap", nullable=false, length=65536)	
	private String operation_AttributeMap;
	
	@ManyToOne(targetEntity= StandartOperation.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="StandartOperation_id", referencedColumnName="StandartOperation_id", nullable=false) }, foreignKey=@ForeignKey(name="FKOperation445312"))	
	private StandartOperation standartOperationStandartOperation;
	
	@ManyToMany(mappedBy="ORM_operationOperation", targetEntity= Route.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_routeRoute = new java.util.HashSet();

    //@Transient
	//public final RouteSetCollection routeRoute = new RouteSetCollection(this, _ormAdapter, ORMConstants.KEY_OPERATION_ROUTEROUTE, ORMConstants.KEY_ROUTE_OPERATIONOPERATION, ORMConstants.KEY_MUL_MANY_TO_MANY);

}
