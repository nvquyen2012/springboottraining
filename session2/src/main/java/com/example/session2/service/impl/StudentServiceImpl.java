package com.example.session2.service.impl;

import com.example.session2.entity.Student;
import com.example.session2.mapper.CourseMapper2;
import com.example.session2.mapper.StudentMapper;
import com.example.session2.repository.StudentRepository;
import com.example.session2.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentMapper studentMapper;

    private final StudentRepository studentRepository;

    private final CourseMapper2  courseMapper2;
    

    @Override
    public Page getAll(Pageable pageable) {
        Page<Student> page = studentRepository.findAll(pageable);
        return page;
    }
}
