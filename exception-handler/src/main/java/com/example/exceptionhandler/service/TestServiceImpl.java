package com.example.exceptionhandler.service;

import com.example.exceptionhandler.handler.NotFoundException;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{

    @Override
    public void throwNotFoundException() {
        throw new NotFoundException("not found exception");
    }
}
