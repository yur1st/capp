package com.capp.tech.model.entity;

import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "OperationStatus")
@Table(name = "operation_status")
@Data
@Audited
public class OperationStatus extends BaseEntity {
    private String status;
    private String name;

    @OneToMany(mappedBy = "status", cascade = CascadeType.ALL)
    private List<Operation> operations = new ArrayList<>();

    public void addOperation(Operation operation) {
        operations.add(operation);
        operation.setStatus(this);
    }

    public void removeOperation(Operation operation) {
        operations.remove(operation);
        operation.setStatus(null);
    }


}
