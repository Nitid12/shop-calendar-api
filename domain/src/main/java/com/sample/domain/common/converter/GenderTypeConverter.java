package com.sample.domain.common.converter;

import com.sample.domain.common.enums.Gender;

import javax.persistence.Converter;

@Converter(autoApply = true)
public class GenderTypeConverter extends CodeValueConverter<Gender> {
    GenderTypeConverter() {
        super(Gender.class);
    }
}
