package com.capp.tech.model.entity;

import javax.persistence.*;
import java.io.Serializable;

@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Device")
public class Device implements Serializable {
	public Device() {
	}

    @Column(name="Device_id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DEVICE_DEVICE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DEVICE_DEVICE_ID_GENERATOR", strategy="native")	
	private int device_id;
	
	@Column(name="Device_name", nullable=false, unique=true, length=255)	
	private String device_name;
	
	@OneToOne(optional=false, targetEntity= Route.class, fetch=FetchType.LAZY)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TravellerRoute_ID", referencedColumnName="Route_ID", nullable=false) }, foreignKey=@ForeignKey(name="FKDevice265897"))	
	private Route travellerRoute;

}
