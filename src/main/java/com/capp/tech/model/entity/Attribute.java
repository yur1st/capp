package com.capp.tech.model.entity;

import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "Attribute")
@Table(name = "attribute")
@Data
@Audited
public class Attribute extends BaseEntity {

	private String name;

	private boolean isInfluenceCT;

	@OneToMany(mappedBy = "attribute", cascade = CascadeType.ALL,
			orphanRemoval = true)
	private Set<AttributeLimit> limitSet;

	@OneToOne(mappedBy = "attribute", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private AttributeLimitRange limitRange;

	@OneToOne(mappedBy = "attribute", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private AttributeType attributeType;

	@OneToOne(mappedBy = "attribute", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Unit unit;

	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name = "attribute_standart_operation",
			joinColumns = @JoinColumn(name = "attribute_id"),
			inverseJoinColumns = @JoinColumn(name = "standart_operation_id"))
	private Set<StandartOperation> standartOperations = new HashSet<>();

	public void addLimitSet(AttributeLimit limit) {
		limitSet.add(limit);
		limit.setAttribute(this);
	}

	public void removeLimitSet(AttributeLimit limit) {
		limitSet.remove(limit);
		limit.setAttribute(null);
	}

	public void setLimitRange(AttributeLimitRange range) {
		this.limitRange = range;
		range.setAttribute(this);
	}

	public void setAttributeType(AttributeType attributeType) {
		this.attributeType = attributeType;
		attributeType.setAttribute(this);
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
		unit.setAttribute(this);
	}

	public void addStandartOperation(StandartOperation standartOperation) {
		standartOperations.add(standartOperation);
		standartOperation.getAttributes().add(this);
	}

	public void removeStandartOperation(StandartOperation standartOperation) {
		standartOperations.remove(standartOperation);
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
