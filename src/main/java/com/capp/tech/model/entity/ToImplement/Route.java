package com.capp.tech.model.entity.ToImplement;

public class Route {
	public Route() {
	}

    private int route_ID;
	
	private String route_name;
	
	private RouteStatus routeTypeRouteType;
	
	private StandartRroute std_routeStd_route;
	
	private Workplace workplaceWorkplace;
	
	private Device device;

    //@Transient
	//public final OperationSetCollection operationOperation = new OperationSetCollection(this, _ormAdapter, ORMConstants.KEY_ROUTE_OPERATIONOPERATION, ORMConstants.KEY_OPERATION_ROUTEROUTE, ORMConstants.KEY_MUL_MANY_TO_MANY);

}
