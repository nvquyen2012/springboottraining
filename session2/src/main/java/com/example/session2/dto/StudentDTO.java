package com.example.session2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StudentDTO {

    private String id;

    private String name;

    private int age;

    private String rollNumber;

    private String email;

    private String gender;
}
