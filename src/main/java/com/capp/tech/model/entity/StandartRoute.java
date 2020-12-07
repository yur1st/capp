package com.capp.tech.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "StandartRoute")
@Table(name = "standart_route")
@Data
public class StandartRoute extends BaseEntity {

	private String name;

	private int operationPriority;

	@ManyToOne(fetch = FetchType.LAZY,
			optional = false,
			cascade = CascadeType.PERSIST)
	@JoinColumn("standart_operation_id")
	private StandartOperation standartOperation;

	//@Transient
	//public final RouteSetCollection route = new RouteSetCollection(this, _ormAdapter, ORMConstants.KEY_STANDARTRROUTE_ROUTE, ORMConstants.KEY_ROUTE_STD_ROUTESTD_ROUTE, ORMConstants.KEY_MUL_ONE_TO_MANY);

}
