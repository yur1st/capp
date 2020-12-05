package com.capp.tech.model.entity.ToImplement;

public class StandartOperation {
	public StandartOperation() {
	}

    private int standartOperation_id;
	
	private String standartOperation_name;
	
	private AttributeSet attributeSetAttributeSet;
	
	private java.util.Set ORM_standartRroute = new java.util.HashSet();
	
	private java.util.Set ORM_operation = new java.util.HashSet();

    //@Transient
	//public final StandartRrouteSetCollection standartRroute = new StandartRrouteSetCollection(this, _ormAdapter, ORMConstants.KEY_STANDARTOPERATION_STANDARTRROUTE, ORMConstants.KEY_STANDARTRROUTE_STANDARTOPERATIONSTANDARTOPERATION, ORMConstants.KEY_MUL_ONE_TO_MANY);

    //@Transient
	//public final OperationSetCollection operation = new OperationSetCollection(this, _ormAdapter, ORMConstants.KEY_STANDARTOPERATION_OPERATION, ORMConstants.KEY_OPERATION_STANDARTOPERATIONSTANDARTOPERATION, ORMConstants.KEY_MUL_ONE_TO_MANY);

}
