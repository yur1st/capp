package com.capp.tech.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Line")
@Table(name = "line")
@Data
public class Line extends BaseEntity {

    private Long lineId;

    private String lineName;

}
