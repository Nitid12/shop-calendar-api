package com.sample.service;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import com.sample.domain.common.enums.CouponCondition;
import com.sample.domain.common.enums.CouponKind;
import com.sample.domain.primary.store.model.embedded.CouponConditionValue;
import com.sample.domain.primary.store.model.embedded.CouponKindValue;
import com.sample.domain.primary.store.model.embedded.Period;
import com.sample.domain.primary.store.model.entity.Coupon;
import com.sample.domain.primary.store.model.entity.FavoriteCoupon;
import com.sample.domain.primary.store.repository.CouponRepository;
import com.sample.domain.primary.store.repository.FavoriteCouponRepository;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.java.Log;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@ExtendWith(MockitoExtension.class)
public class SetFavoriteCouponOfStoreTest {

    @BeforeEach
    void getCouponList() {
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

}
