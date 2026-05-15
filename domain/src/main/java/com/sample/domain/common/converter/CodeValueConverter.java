package com.sample.domain.common.converter;

import javax.persistence.AttributeConverter;
import java.util.EnumSet;
import java.util.NoSuchElementException;

public class CodeValueConverter<E extends Enum<E> & CodeValue> implements AttributeConverter<E, String> {

    private final Class<E> clz;

    CodeValueConverter(Class<E> enumClass) {
        this.clz = enumClass;
    }

    @Override
    public String convertToDatabaseColumn(E attribute) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    @Override
    public E convertToEntityAttribute(String dbData) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }
}
