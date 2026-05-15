package com.sample.common.converter;

import com.sample.common.ShopConstants;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class LocalDateTimeToIntegerConverter implements Converter<LocalDateTime, Integer> {

    @Override
    public Integer convert(LocalDateTime source) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }
}
