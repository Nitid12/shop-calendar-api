package com.sample;

import static org.assertj.core.api.Assertions.assertThat;
import com.sample.domain.common.enums.HostingType;
import com.sample.domain.primary.store.model.entity.Store;
import com.sample.feign.cafe24.Cafe24ResponseMapper;
import com.sample.feign.general.GeneralHostResponseMapper;
import com.sample.manager.PushBatchManager;
import com.sample.manager.StatsBatchManager;
import com.sample.service.EPDataService;
import com.sample.service.EventService;
import com.sample.service.StatsService;
import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

@SpringBootTest
@EnableFeignClients
@ComponentScan
@Transactional
@ContextConfiguration(classes = { SpringValidatorAdapter.class })
@Slf4j
public class StatsBatchManagerTest {

    @BeforeEach
    void setProperties() {
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

 
    @Test
    @Rollback(false)
    void 통합_테스트() throws Exception {
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }
}
