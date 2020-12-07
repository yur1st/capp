package com.capp.tech.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "Attribute")
@Table(name = "attribute")
@Data
public class Attribute extends BaseEntity {

	private String name;

	private boolean isInfluenceCT;

	@OneToMany(cascade = CascadeType.ALL,
			orphanRemoval = true)
	private Set<AttributeLimit> limitSet;

	@OneToOne(fetch = FetchType.LAZY,
			optional = false,
			cascade = CascadeType.PERSIST)
	@JoinColumn("attribute_limit_range_id")
	private AttributeLimitRange limitRange;

	@OneToOne(fetch = FetchType.LAZY,
			optional = false,
			cascade = CascadeType.PERSIST)
	@JoinColumn("attribute_type_id")
	private AttributeType attributeTypeAttributeType;

	@OneToOne(fetch = FetchType.LAZY,
			optional = false,
			cascade = CascadeType.PERSIST)
	@JoinColumn("unit_id")
	private Unit unit;

	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name = "attribute_standart_operation",
			joinColumns = @JoinColumn(name = "attribute_id"),
			inverseJoinColumns = @JoinColumn(name = "standart_operation_id"))
	private Set<StandartOperation> operations = new HashSet<>();

	public void addStandartOperation(StandartOperation standartOperation) {
		operations.add(standartOperation);
		standartOperation.getAttributes().add(this);
	}

	public void removeStandartOperation(StandartOperation standartOperation) {
		operations.remove(standartOperation);
		standartOperation.getAttributes().remove(this);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Attribute)) return false;
		return id != null && id.equals(((Attribute) o).getId());
	}

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
}
