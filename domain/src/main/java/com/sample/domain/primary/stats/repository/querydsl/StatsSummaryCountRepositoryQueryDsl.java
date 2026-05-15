package com.sample.domain.primary.stats.repository.querydsl;

import com.sample.domain.primary.stats.model.dto.FavoriteCountCondition;
import com.sample.domain.primary.stats.model.dto.StatsSummaryDto;
import java.util.List;
import java.util.Optional;

public interface StatsSummaryCountRepositoryQueryDsl {
    List<StatsSummaryDto> findStatsSummaryCountList(Long storeId, Integer startDate, Integer endDate);
    List<StatsSummaryDto> findStatsSummaryForGraph(Long storeId, Integer startDate, Integer endDate);
    Optional<Integer> findFavoriteCount(FavoriteCountCondition condition);

}
