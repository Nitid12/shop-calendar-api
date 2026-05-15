package com.sample.service;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import com.sample.domain.primary.store.model.embedded.Period;
import com.sample.domain.primary.store.model.entity.Event;
import com.sample.domain.primary.store.model.entity.FavoriteEvent;
import com.sample.domain.primary.store.repository.EventRepository;
import com.sample.domain.primary.store.repository.FavoriteEventRepository;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@ExtendWith(MockitoExtension.class)
public class SetFavoriteEventOfStoreTest {

    @Test
    @DisplayName("중복 제거 후 값 존재하는 이벤트 리스트가 있다")
    void getEventListForSave() {
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

}
