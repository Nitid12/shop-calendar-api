package com.sample.domain.primary.stats.repository.querydsl;

import com.sample.domain.common.enums.StatsType;
import com.sample.domain.primary.stats.model.dto.FavoriteCountCondition;
import com.sample.domain.primary.stats.model.dto.StatsSummaryDto;
import com.sample.domain.primary.stats.model.entity.QStatsSummaryCount;
import com.sample.domain.primary.store.model.embedded.Period;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class StatsSummaryCountRepositoryQueryDslImpl implements StatsSummaryCountRepositoryQueryDsl {

    private final JPAQueryFactory queryFactory;

    private final String FORMAT_DATE = "yyyyMMdd";

    private QStatsSummaryCount statsSummaryCount = QStatsSummaryCount.statsSummaryCount;

    @Override
    public List<StatsSummaryDto> findStatsSummaryCountList(Long storeId, Integer startDate, Integer endDate) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    @Override
    public List<StatsSummaryDto> findStatsSummaryForGraph(Long storeId, Integer startDate, Integer endDate) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    @Override
    public Optional<Integer> findFavoriteCount(FavoriteCountCondition condition) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    private BooleanExpression checkStoreId(Long storeId) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

}
