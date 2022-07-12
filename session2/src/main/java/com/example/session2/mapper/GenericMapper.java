package com.example.session2.mapper;

public interface GenericMapper<T, D>{

    T toEntity(D d);

    D toDTO(T t);
}
