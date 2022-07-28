package com.example.session2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CourseDTO {

    private Long id;

    private String code;

    private String name;

    private String description;
}