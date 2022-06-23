package com.example.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
@SequenceGenerator(sequenceName = "HIBERNATE_SEQUENCE", name = "PERMISSION_SEQ", initialValue = 1, allocationSize = 1)
//@JsonIgnoreProperties(value = {"users"})
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "HIBERNATE_SEQUENCE")
    @Column(name = "ID", nullable = false, unique = true, updatable = false)
    private Long id;

    private String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "permissions", cascade = {CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    private List<User> users = new ArrayList<>();
}
