package com.capp.tech.model.embedded;


import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Data
@Builder(toBuilder = true)
@Embeddable
public class OperationRouteId implements Serializable {

    @Column(name = "operation_id")
    private Long operationId;

    @Column(name = "route_id")
    private Long routeId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OperationRouteId that = (OperationRouteId) o;
        return Objects.equals(operationId, that.operationId) &&
                Objects.equals(routeId, that.routeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationId, routeId);
    }
}

