package com.capp.tech.model.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Workplace")
public class Workplace implements Serializable {
	public Workplace() {
	}

    @Column(name="Workplace_id", nullable=false, length=10)
	@Id	
	@GeneratedValue(generator="WORKPLACE_WORKPLACE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="WORKPLACE_WORKPLACE_ID_GENERATOR", strategy="native")	
	private int workplace_id;
	
	@Column(name="Workplace_name", nullable=false, length=255)	
	private String workplace_name;

    //@Transient
	//public final RouteSetCollection route = new RouteSetCollection(this, _ormAdapter, ORMConstants.KEY_WORKPLACE_ROUTE, ORMConstants.KEY_ROUTE_WORKPLACEWORKPLACE, ORMConstants.KEY_MUL_ONE_TO_MANY);

}
