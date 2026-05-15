package com.sample.annotation;

import com.sample.common.ShopConstants;
import com.sample.common.exception.BusinessException;
import com.sample.common.response.ResponseCode;
import com.sample.domain.common.enums.ViewType;
import com.sample.domain.primary.stats.model.dto.StatsDto;
import com.sample.dto.request.ViewStatsRequest;
import com.sample.dto.response.CouponResponse;
import com.sample.dto.response.FullStoreResponse;
import com.sample.dto.response.ItemResponse;
import com.sample.service.LogService;
import com.sample.service.UserService;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.expression.EvaluationContext;
import org.springframework.stereotype.Component;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import static com.sample.common.ShopConstants.NO_VALUE;

@Aspect
@Component
@RequiredArgsConstructor
public class StatsAspect {

    @Around("@annotation(ViewStats)")
    public Object makeViewStats(ProceedingJoinPoint joinPoint) throws Throwable {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

}
