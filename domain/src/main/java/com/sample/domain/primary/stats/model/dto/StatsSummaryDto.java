package com.sample.domain.primary.stats.model.dto;

import com.sample.domain.common.converter.StatsTypeConverter;
import com.sample.domain.common.enums.StatsType;
import javax.persistence.Convert;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StatsSummaryDto {

    private Integer statsDt;
    @Convert(converter = StatsTypeConverter.class)
    private StatsType statsType;
    private Integer viewCount;
    private Integer clickCount;
    private Integer favoriteCount;
}
