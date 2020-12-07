package com.capp.tech.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "OperationStatus")
@Table(name = "operation_status")
@Data
public class OperationStatus extends BaseEntity {
    private String status;
    private String name;
}
