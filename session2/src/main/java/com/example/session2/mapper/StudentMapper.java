package com.example.session2.mapper;

import com.example.session2.dto.StudentDTO;
import com.example.session2.entity.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper extends GenericMapper<Student, StudentDTO>{
}
