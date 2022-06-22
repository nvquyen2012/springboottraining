package com.example.jpa.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BasePageRequest {

    private Integer page;

    private Integer size;
}
