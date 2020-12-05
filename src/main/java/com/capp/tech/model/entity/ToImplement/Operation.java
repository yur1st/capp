package com.capp.tech.model.entity.ToImplement;

public class Operation {
	public Operation() {
	}

    private int operation_id;
	
	private Float operation_CT;
	
	private String operation_AttributeMap;
	
	private StandartOperation standartOperationStandartOperation;
	
	private java.util.Set ORM_routeRoute = new java.util.HashSet();

    //@Transient
	//public final RouteSetCollection routeRoute = new RouteSetCollection(this, _ormAdapter, ORMConstants.KEY_OPERATION_ROUTEROUTE, ORMConstants.KEY_ROUTE_OPERATIONOPERATION, ORMConstants.KEY_MUL_MANY_TO_MANY);

}
