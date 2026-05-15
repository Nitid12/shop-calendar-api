package com.sample.domain.primary.stats.model.entity;

import com.sample.domain.common.converter.StatsTypeConverter;
import com.sample.domain.common.enums.StatsType;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class StatsSummaryCount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer statsDt;
    private Integer statsHh;
    private Long storeId;
    @Convert(converter = StatsTypeConverter.class)
    private StatsType statsType;
    private Integer viewCount;
    private Integer clickCount;
    private Integer favoriteCount;
}
