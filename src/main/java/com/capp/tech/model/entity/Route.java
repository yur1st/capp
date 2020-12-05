package com.capp.tech.model.entity;

import javax.persistence.*;
import java.io.Serializable;

@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Route")
public class Route implements Serializable {
	public Route() {
	}

    @Column(name="Route_ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="ROUTE_ROUTE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ROUTE_ROUTE_ID_GENERATOR", strategy="native")	
	private int route_ID;
	
	@Column(name="Route_name", nullable=false, length=255)	
	private String route_name;
	
	@ManyToOne(targetEntity= RouteStatus.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="RouteType_id", referencedColumnName="RouteStatus_id", nullable=false) }, foreignKey=@ForeignKey(name="FK_RouteId_RouteStatusId"))
	private RouteStatus routeTypeRouteType;
	
	@ManyToOne(targetEntity= StandartRroute.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="StandartRoute_id", referencedColumnName="StandartRoute_id", nullable=false) }, foreignKey=@ForeignKey(name="FK_RouteId_StandartRouteId"))
	private StandartRroute std_routeStd_route;
	
	@ManyToOne(targetEntity= Workplace.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="Workplace_id", referencedColumnName="Workplace_id", nullable=false) }, foreignKey=@ForeignKey(name="FKRoute715001"))	
	private Workplace workplaceWorkplace;
	
	@ManyToMany(targetEntity=Operation.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Operation_Route", joinColumns={ @JoinColumn(name="RouteRoute_ID") }, inverseJoinColumns={ @JoinColumn(name="OperationOperation_id") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_operationOperation = new java.util.HashSet();
	
	@OneToOne(mappedBy="travellerRoute", targetEntity=Device.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private Device device;

    //@Transient
	//public final OperationSetCollection operationOperation = new OperationSetCollection(this, _ormAdapter, ORMConstants.KEY_ROUTE_OPERATIONOPERATION, ORMConstants.KEY_OPERATION_ROUTEROUTE, ORMConstants.KEY_MUL_MANY_TO_MANY);

}
