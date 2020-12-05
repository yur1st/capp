package com.capp.tech.model.entity;

public class AttributeSet{
	public AttributeSet() {
	}

    private int attributeSet_id;
	
	private String attributeSet_Keys;
	
	private java.util.Set ORM_standartOperation = new java.util.HashSet();

    //@Transient
	//public final StandartOperationSetCollection standartOperation = new StandartOperationSetCollection(this, _ormAdapter, ORMConstants.KEY_ATTRIBUTESET_STANDARTOPERATION, ORMConstants.KEY_STANDARTOPERATION_ATTRIBUTESETATTRIBUTESET, ORMConstants.KEY_MUL_ONE_TO_MANY);

}
