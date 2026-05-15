package com.sample;

import com.sample.domain.common.enums.StatsType;
import com.sample.domain.primary.stats.model.dto.StatsSummaryDto;
import com.sample.domain.primary.stats.repository.StatsSummaryCountRepository;
import com.sample.domain.primary.user.model.dto.web.GraphStatsInfo;
import com.sample.dto.response.web.WebStatisticsResponse;
import com.sample.utils.HolidayUtils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan
public class WebStatisticsServiceTest {

    @Autowired
    StatsSummaryCountRepository statsSummaryCountRepository;

    @Autowired
    HolidayUtils holidayUtils;

    @Test
    void 통계_테스트() {
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }
}
