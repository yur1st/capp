package com.capp.tech.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "Route")
@Table(name = "route")
@Data
public class Route extends BaseEntity {

	private String name;
	@ManyToOne(fetch = FetchType.LAZY,
			optional = false,
			cascade = CascadeType.PERSIST)
	@JoinColumn("route_status_id")
	private RouteStatus status;

	@ManyToOne(fetch = FetchType.LAZY,
			optional = false,
			cascade = CascadeType.PERSIST)
	@JoinColumn("standart_route_id")
	private StandartRoute standartRoute;

	@OneToOne(optional = false, mappedBy = "route_id")
	private Device device;

}
