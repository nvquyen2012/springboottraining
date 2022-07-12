package com.example.session2.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StudentService {

    Page getAll(Pageable pageable);
}
