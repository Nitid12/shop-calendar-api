package com.sample.dto.interfaces;

import java.time.LocalDate;

public interface PeriodInterface {
    Long getId();
    void setExpired(boolean value);
    void setActivated(boolean value);
    LocalDate getStartDate();
    LocalDate getEndDate();

}
