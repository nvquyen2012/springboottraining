package com.example.jpa.service.impl;

import com.example.jpa.entity.User;
import com.example.jpa.model.BasePageRequest;
import com.example.jpa.repository.UserRepository;
import com.example.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    private UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public Page<User> getList(String permissionName, BasePageRequest request) {
        PageRequest pageRequest = PageRequest.of(request.getPage(), request.getSize());
        if (permissionName != null) {
            return userRepository.findUserByPermissions_Name(permissionName, pageRequest);
        } else return userRepository.findAll(pageRequest);
    }
}
