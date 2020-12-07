package com.capp.tech.model.entity;

import javax.persistence.*;

@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    protected Long id;

    @ManyToOne(
            fetch = FetchType.LAZY,
            optional = false,
            cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id")
    protected User owner;

    @ManyToOne(
            fetch = FetchType.LAZY,
            optional = false,
            cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id")
    protected User lastModifier;

    protected BaseEntity() {
    }

    protected BaseEntity(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
