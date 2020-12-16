package com.capp.tech.model.entity;

import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@Entity(name = "Route")
@Table(name = "route")
@Data
@Audited
public class Route extends BaseEntity {

	private String name;

	@OneToMany(mappedBy = "route", cascade = CascadeType.ALL)
	private List<OperationRoute> operations = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name = "status_id")
	private RouteStatus status;

	@ManyToOne(fetch = FetchType.LAZY,
			optional = false,
			cascade = CascadeType.PERSIST)
	@JoinColumn(name = "standart_route_id")
	private StandartRoute standartRoute;

	@OneToOne
	@JoinColumn(name = "device_id")
	private Device device;

	public void addOperation(Operation operation) {
		OperationRoute operationRoute = new OperationRoute(operation, this);
		operations.add(operationRoute);
		operation.getRoutes().add(operationRoute);
	}

	public void removeOperation(Operation operation) {
		for (Iterator<OperationRoute> iterator = operations.iterator(); iterator.hasNext(); ) {
			OperationRoute operationRoute = iterator.next();

			if (operationRoute.getRoute().equals(this) && operationRoute.getOperation().equals(operation)) {
				iterator.remove();
				operationRoute.getOperation().getRoutes().remove(operationRoute);
				operationRoute.setOperation(null);
				operationRoute.setRoute(null);
			}
		}
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Route route = (Route) o;

		return Objects.equals(name, route.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
