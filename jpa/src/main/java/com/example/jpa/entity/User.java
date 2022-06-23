package com.example.jpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
@Data
@SequenceGenerator(sequenceName = "HIBERNATE_SEQUENCE", name = "USER_SEQ", initialValue = 1, allocationSize = 1)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "HIBERNATE_SEQUENCE")
    @Column(name = "ID", nullable = false, unique = true, updatable = false)
    private Long id;

    private String name;

    private String email;

    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinTable(name = "user_permission", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "permission_id"))
    private Set<Permission> permissions = new HashSet<>();
}
