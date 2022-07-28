package com.example.session2.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum TestEnum {
    MALE("m"),
    FEMALE("f"),
    OTHER("o"),
    HIDDEN("h");

    private String value;

    private static Map<String, TestEnum> genderMap = new HashMap<>();
    static {
        for (TestEnum gender: TestEnum.values()) {
            genderMap.put(gender.value, gender);
        }
    }

    public static TestEnum of(String s) {
        return genderMap.get(s);
    }
}
