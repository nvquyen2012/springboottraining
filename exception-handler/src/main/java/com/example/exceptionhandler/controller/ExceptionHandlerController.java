package com.example.exceptionhandler.controller;

import com.example.exceptionhandler.handler.NotFoundException;
import com.example.exceptionhandler.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exception-handler")
@RequiredArgsConstructor
public class ExceptionHandlerController {

    private final TestService testService;

    @GetMapping("/test")
    public ResponseEntity throwNotFoundException() {
        testService.throwNotFoundException();

        return ResponseEntity.ok().body("Success String");
    }
}
