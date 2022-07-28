package com.example.session2.mapper;

import com.example.session2.dto.CourseDTO;
import com.example.session2.entity.Course;
import org.mapstruct.Mapper;

@Mapper
public interface CourseMapper2 {
    CourseDTO toDto(Course course);
}
