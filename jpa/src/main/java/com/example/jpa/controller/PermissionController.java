package com.example.jpa.controller;

import com.example.jpa.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/permission")
public class PermissionController {

    @Autowired
    private PermissionRepository permissionRepository;

    @GetMapping
    public ResponseEntity<?> getPermissionBy(@RequestParam("username") String username) {
        return ResponseEntity.ok(permissionRepository.findPermissionByUsers_Name(username, PageRequest.of(0, 100)).getContent());
    }
}
