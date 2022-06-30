package com.example.jpa.mapper;

import com.example.jpa.dto.UserDTO;
import com.example.jpa.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper{

    UserMapper MAPPER = Mappers.getMapper(UserMapper.class);

    User convert(UserDTO userDTO);

    UserDTO convert(User user);
}


