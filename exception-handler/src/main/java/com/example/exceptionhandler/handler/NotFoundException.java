package com.example.exceptionhandler.handler;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class NotFoundException extends RuntimeException{

    private String code;

    public NotFoundException(String code) {
        this.code = code;
    }
}
