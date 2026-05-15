package com.sample.domain.primary.stats.repository;

import com.sample.domain.common.enums.StatsType;
import com.sample.domain.primary.stats.model.entity.StatsSummaryCount;
import com.sample.domain.primary.stats.repository.querydsl.StatsSummaryCountRepositoryQueryDsl;
import com.sample.domain.primary.store.model.dto.web.SummaryStatCountDto;
import com.sample.domain.primary.user.model.dto.web.CountByDateDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface StatsSummaryCountRepository extends JpaRepository<StatsSummaryCount, Long>,
                StatsSummaryCountRepositoryQueryDsl {

        @Transactional
        @Query("select sum(ssc.favoriteCount) "
                        + "from StatsSummaryCount ssc "
                        + "where ssc.storeId = :storeId "
                        + "and ssc.statsType = '02' "
                        + "and ssc.statsDt <= :statsDt ")
        Optional<Long> findByAccrueStatsDtStoreFavoriteCount(@Param("storeId") Long storeId,
                        @Param("statsDt") Integer statsDt);

}
