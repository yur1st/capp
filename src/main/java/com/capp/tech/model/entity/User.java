package com.capp.tech.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity(name = "User")
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
    private Set<Role> roles;

}
