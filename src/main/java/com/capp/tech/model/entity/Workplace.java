package com.capp.tech.model.entity;

import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Workplace")
@Table(name = "workplace")
@Data
@Audited
public class Workplace extends BaseEntity {

	private String name;

	@OneToMany(mappedBy = "workplace", cascade = CascadeType.ALL)
	private List<OperationRoute> operationRoutes;


	@ManyToOne
	@JoinColumn(name = "line_id")
	private Line line;

	public void addOperationRoute(OperationRoute operationRoute) {
		operationRoutes.add(operationRoute);
		operationRoute.setWorkplace(this);
	}

	public void removeOperationRoute(OperationRoute operationRoute) {
		operationRoutes.remove(operationRoute);
		operationRoute.setWorkplace(null);
	}


}
