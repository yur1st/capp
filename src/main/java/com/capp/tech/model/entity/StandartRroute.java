package com.capp.tech.model.entity;

import javax.persistence.*;
import java.io.Serializable;

@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="StandartRroute")
public class StandartRroute implements Serializable {
	public StandartRroute() {
	}

    @Column(name="StandartRoute_id", nullable=false, length=10)
	@Id	
	@GeneratedValue(generator="STANDARTRROUTE_STANDARTROUTE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="STANDARTRROUTE_STANDARTROUTE_ID_GENERATOR", strategy="native")	
	private int standartRoute_id;
	
	@Column(name="StandartRoute_name", nullable=false, unique=true, length=255)	
	private String standartRoute_name;
	
	@Column(name="StandartRoute_sequence", nullable=false, length=10)	
	private int standartRoute_sequence;
	
	@ManyToOne(targetEntity=StandartOperation.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="StandartOperation_id", referencedColumnName="StandartOperation_id", nullable=false) }, foreignKey=@ForeignKey(name="FKStandartRr602992"))	
	private StandartOperation standartOperationStandartOperation;

    //@Transient
	//public final RouteSetCollection route = new RouteSetCollection(this, _ormAdapter, ORMConstants.KEY_STANDARTRROUTE_ROUTE, ORMConstants.KEY_ROUTE_STD_ROUTESTD_ROUTE, ORMConstants.KEY_MUL_ONE_TO_MANY);

}
