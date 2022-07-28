package com.example.session2.mapper;

import com.example.session2.enums.TestEnum;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class TestEnumMapper implements AttributeConverter<TestEnum, String> {

    @Override
    public String convertToDatabaseColumn(TestEnum attribute) {
        return attribute.getValue();
    }

    @Override
    public TestEnum convertToEntityAttribute(String dbData) {
        return TestEnum.of(dbData);
    }
}
