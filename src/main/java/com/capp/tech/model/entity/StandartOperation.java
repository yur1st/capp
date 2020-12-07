package com.capp.tech.model.entity;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity(name = "StandartOperation")
@Table(name = "standart_operation")
@Data
public class StandartOperation extends BaseEntity {

	@NaturalId
	private String name;

	@ManyToMany(mappedBy = "attributes")
	private Set<Attribute> attributes = new HashSet<>();

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		StandartOperation that = (StandartOperation) o;

		return Objects.equals(name, that.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
