package com.capp.tech.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "Operation")
@Table(name = "operation")
@Data
public class Operation extends BaseEntity {

	private Double cycleTime;

	private String AttributeMap;

	@ManyToOne(fetch = FetchType.LAZY,
			optional = false,
			cascade = CascadeType.PERSIST)
	@JoinColumn("operation_status_id")
	private OperationStatus status;

	@ManyToOne(fetch = FetchType.LAZY,
			optional = false,
			cascade = CascadeType.PERSIST)
	@JoinColumn("standart_operation_id")
	private StandartOperation standartOperationStandartOperation;

}
