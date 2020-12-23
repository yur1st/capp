package com.capp.tech.model.entity;

import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "StandartRoute")
@Table(name = "standart_route")
@Data
@Audited
public class StandartRoute extends BaseEntity {

    private String name;

    private int operationPriority;

    private boolean isApproved;

    @OneToOne
    @JoinColumn(unique = true)
    private User approvedBy;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "standart_route_operation",
            joinColumns = @JoinColumn(name = "standart_route_id"),
            inverseJoinColumns = @JoinColumn(name = "standart_operation_id")
    )
    private List<StandartOperation> standartOperations = new ArrayList<>();

    @OneToMany(mappedBy = "standartRoute", cascade = CascadeType.ALL)
    private List<Route> routes = new ArrayList<>();

	public void addRoute(Route route) {
		routes.add(route);
		route.setStandartRoute(this);
	}

	public void removeRoute(Route route) {
		routes.remove(route);
		route.setStandartRoute(null);
	}

}
