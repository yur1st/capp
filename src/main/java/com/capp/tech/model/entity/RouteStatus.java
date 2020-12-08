package com.capp.tech.model.entity;


import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity(name = "RouteStatus")
@Table(name = "route_status")
@Data
@Audited
public class RouteStatus extends BaseEntity {

	private String status;
	private String name;

	@OneToMany(mappedBy = "status", cascade = CascadeType.ALL)
	private List<Route> routes;

	public void addRoute(Route route) {
		routes.add(route);
		route.setStatus(this);
	}

	public void removeRoute(Route route) {
		routes.remove(route);
		route.setStatus(null);
	}

}
