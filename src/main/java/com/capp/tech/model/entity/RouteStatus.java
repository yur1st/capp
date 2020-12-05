package com.capp.tech.model.entity;

import javax.persistence.*;
import java.io.Serializable;

@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="RouteStatus")
public class RouteStatus implements Serializable {
	public RouteStatus() {
	}

    @Column(name="RouteStatus_id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="ROUTESTATUS_ROUTESTATUS_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ROUTESTATUS_ROUTESTATUS_ID_GENERATOR", strategy="native")	
	private int routeStatus_id;
	
	@Column(name="RouteType_name", nullable=false, length=255)	
	private String routeType_name;
	
	@OneToMany(mappedBy="routeTypeRouteType", targetEntity=Route.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_route = new java.util.HashSet();

    //@Transient
	//public final RouteSetCollection route = new RouteSetCollection(this, _ormAdapter, ORMConstants.KEY_ROUTESTATUS_ROUTE, ORMConstants.KEY_ROUTE_ROUTETYPEROUTETYPE, ORMConstants.KEY_MUL_ONE_TO_MANY);

}
