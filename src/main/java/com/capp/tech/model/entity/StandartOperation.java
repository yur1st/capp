package com.capp.tech.model.entity;

import lombok.Data;
import org.hibernate.annotations.NaturalId;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity(name = "StandartOperation")
@Table(name = "standart_operation")
@Data
@Audited
public class StandartOperation extends BaseEntity {

	@NaturalId
	private String name;

	@ManyToMany(mappedBy = "standartOperations")
	private Set<Attribute> attributes = new HashSet<>();

	@OneToMany(mappedBy = "standartOperation", cascade = CascadeType.ALL)
	private Set<Operation> operations;

	@ManyToMany(mappedBy = "standartOperations")
	private List<StandartRoute> standartRoutes;

	public void addOperation(Operation operation) {
		operations.add(operation);
		operation.setStandartOperation(this);
	}

	public void removeOperation(Operation operation) {
		operations.remove(operation);
		operation.setStandartOperation(null);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		StandartOperation that = (StandartOperation) o;

		return Objects.equals(name, that.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
