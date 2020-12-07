package com.capp.tech.model.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "RouteStatus")
@Table(name = "route_status")
@Data
public class RouteStatus extends BaseEntity {

	private String status;
	private String name;

}
