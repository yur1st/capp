package com.capp.tech.model.entity;

import com.capp.tech.model.embedded.OperationRouteId;
import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
public class OperationRoute {

    @EmbeddedId
    private OperationRouteId id;

    @ManyToOne(fetch = FetchType.LAZY,
            optional = false,
            cascade = CascadeType.PERSIST)
    @JoinColumn("operation_id")
    private Operation operation;

    @ManyToOne(fetch = FetchType.LAZY,
            optional = false,
            cascade = CascadeType.PERSIST)
    @JoinColumn("route_id")
    private Route route;

    @ManyToOne(fetch = FetchType.LAZY,
            optional = false,
            cascade = CascadeType.PERSIST)
    @JoinColumn("workplace_id")
    private Workplace workplace;

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
