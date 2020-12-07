package com.capp.tech.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "Device")
@Table(name = "device")
@Data
public class Device extends BaseEntity {

	private String name;

	@OneToOne(fetch = FetchType.LAZY,
			optional = false,
			cascade = CascadeType.PERSIST)
	@JoinColumn("route_id")
	private Route travellerRoute;

}
