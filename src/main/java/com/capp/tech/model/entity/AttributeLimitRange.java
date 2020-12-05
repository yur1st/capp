package com.capp.tech.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AttributeLimitRange {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private double attributeLimitRangeMin;

	private double attributeLimitRangeMax;

	public AttributeLimitRange() {
	}

	public AttributeLimitRange(Long id, float attributLimitRangeMin, float attributLimitRangeMax) {
		this.id = id;
		this.attributeLimitRangeMin = attributLimitRangeMin;
		this.attributeLimitRangeMax = attributLimitRangeMax;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getAttributeLimitRangeMin() {
		return attributeLimitRangeMin;
	}

	public void setAttributeLimitRangeMin(double attributLimitRangeMin) {
		this.attributeLimitRangeMin = attributLimitRangeMin;
	}

	public double getAttributeLimitRangeMax() {
		return attributeLimitRangeMax;
	}

	public void setAttributeLimitRangeMax(double attributLimitRangeMax) {
		this.attributeLimitRangeMax = attributLimitRangeMax;
	}
}
