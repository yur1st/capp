package com.capp.tech.model.entity;

import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "Device")
@Table(name = "device")
@Data
@Audited
public class Device extends BaseEntity {

	private String name;

	@OneToOne(mappedBy = "device")
	private Route route;

	public void setRoute(Route route) {
		this.route = route;
		route.setDevice(this);
	}

}
