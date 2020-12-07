package com.capp.tech.model.entity;

import com.capp.tech.model.embedded.OperationRouteId;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "OperationRoute")
@Table(name = "operation_route")
@Data
@Audited
public class OperationRoute {

    @EmbeddedId
    private OperationRouteId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("operationId")
    private Operation operation;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("routeId")
    private Route route;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workplace_id")
    private Workplace workplace;

    public OperationRoute() {
    }

    public OperationRoute(Operation operation, Route route) {
        this.operation = operation;
        this.route = route;
        this.id = OperationRouteId.builder()
                .operationId(operation.getId())
                .routeId(route.getId())
                .build();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OperationRoute that = (OperationRoute) o;
        return Objects.equals(operation, that.operation) &&
                Objects.equals(route, that.route);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operation, route);
    }


}
