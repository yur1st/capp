package com.capp.tech.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "Workplace")
@Table(name = "workplace")
@Data
public class Workplace extends BaseEntity {

	private String name;

	@ManyToOne(fetch = FetchType.LAZY,
			optional = false,
			cascade = CascadeType.PERSIST)
	@JoinColumn("line_id")
	private Line line;


}
