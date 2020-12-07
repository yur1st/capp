package com.capp.tech.model.embedded;


import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
@Builder(toBuilder = true)
public class OperationRouteId implements Serializable {

    private Long operationId;

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

