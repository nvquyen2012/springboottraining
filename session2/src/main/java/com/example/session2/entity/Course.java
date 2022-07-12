package com.example.session2.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "COURSE", uniqueConstraints = @UniqueConstraint(name = "UNQ_COURSE_CODE", columnNames = "code"))
@SequenceGenerator(name = "SEQ_COURSE", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_COURSE")
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SEQ_COURSE")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "code", columnDefinition = "nvarchar(6)", unique = true)
    private String code;

    private String name;

    private String description;

}
