package com.sample.domain.common;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Period {

    private Integer startDate;
    private Integer endDate;

    @Builder
    public Period(Integer startDate, Integer endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

}
