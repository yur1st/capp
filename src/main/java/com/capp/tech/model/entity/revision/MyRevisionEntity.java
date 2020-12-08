package com.capp.tech.model.entity.revision;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.DefaultRevisionEntity;
import org.hibernate.envers.RevisionEntity;

import javax.persistence.Entity;

@Entity
@RevisionEntity
@Getter
@Setter
public class MyRevisionEntity extends DefaultRevisionEntity {

    private String userName;
}
