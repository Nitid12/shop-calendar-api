package com.sample.domain.common.enums;

import com.sample.domain.common.converter.CodeValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Gender implements CodeValue {
    MALE("00", "MALE"),
    FEMALE("01", "FEMALE");

    private final String code;
    private final String value;

}
