package com.sample.common;

import org.modelmapper.ModelMapper;

public class CustomModelMapper extends ModelMapper {

    @Override
    public <D> D map(Object source, Class<D> destinationType) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }
}
