package com.example.jpa.service;

import com.example.jpa.entity.User;
import com.example.jpa.model.BasePageRequest;
import org.springframework.data.domain.Page;

public interface UserService {

    User create(User user);

    Page getList(String permissionName, BasePageRequest request);
}
