package com.example.session2.mapper;

import com.example.session2.dto.CourseDTO;
import com.example.session2.dto.StudentDTO;
import com.example.session2.entity.Course;
import com.example.session2.entity.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CourseMapper extends GenericMapper<Course, CourseDTO>{
}
