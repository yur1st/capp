package com.capp.tech.model.entity.ToImplement;

public class RouteStatus {
	public RouteStatus() {
	}

    private int routeStatus_id;
	
	private String routeType_name;
	
	private java.util.Set ORM_route = new java.util.HashSet();

    //@Transient
	//public final RouteSetCollection route = new RouteSetCollection(this, _ormAdapter, ORMConstants.KEY_ROUTESTATUS_ROUTE, ORMConstants.KEY_ROUTE_ROUTETYPEROUTETYPE, ORMConstants.KEY_MUL_ONE_TO_MANY);

}
