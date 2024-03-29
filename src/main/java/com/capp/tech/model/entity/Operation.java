package com.capp.tech.model.entity;

import lombok.Data;
import org.hibernate.annotations.Type;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Entity(name = "Operation")
@Table(name = "operation")
@Data
@Audited
public class Operation extends BaseEntity {

    private Double cycleTime;

    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private Map<String, String> attributeMap;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private OperationStatus status;

    @ManyToOne
    @JoinColumn(name = "standart_operation_id")
    private StandartOperation standartOperation;

    @OneToMany(mappedBy = "operation", cascade = CascadeType.ALL)
    private List<OperationRoute> routes = new ArrayList<>();

    public Operation addAttributeValue(String key, String value) {
        attributeMap.put(key, value);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

		Operation operation = (Operation) o;

		return Objects.equals(operation, this);
	}

	@Override
	public int hashCode() {
		return 31 * (attributeMap != null ? attributeMap.hashCode() : 0);
	}
}
