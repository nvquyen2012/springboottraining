package com.example.session2.entity;

import com.example.session2.enums.Gender;
import com.example.session2.mapper.GenderMapper;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT", uniqueConstraints = @UniqueConstraint(name = "UNQ_STUDENT_EMAIL", columnNames = "email"))
@SequenceGenerator(name = "SEQ_STUDENT", initialValue = 1, allocationSize = 1, sequenceName = "SEQ_STUDENT")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SEQ_STUDENT")
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private int age;

    @Column(name = "ROLL_NUMBER")
    private String rollNumber;

    private String email;

    @Convert(converter = GenderMapper.class)
    private Gender gender;

}
