package com.example.jpa.controller;

import com.example.jpa.entity.User;
import com.example.jpa.model.BasePageRequest;
import com.example.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.create(user));
    }

    @GetMapping
    public ResponseEntity<?> getUser(@RequestHeader(value = "permission", required = false) String permissionName, BasePageRequest pageRequest) {
        return ResponseEntity.ok(userService.getList(permissionName, pageRequest).getContent());
    }
}
