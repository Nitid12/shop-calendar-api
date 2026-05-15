package com.sample.annotations;

import com.sample.annotation.SpELParser;
import com.sample.common.exception.BusinessException;
import com.sample.common.response.CommonResponse;
import com.sample.common.response.ResponseCode;
import com.sample.domain.common.enums.UsageStatusType;
import com.sample.service.CustomUserDetails;
import com.sample.service.web.AgencyValidator;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.expression.EvaluationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import java.lang.reflect.Method;

@Aspect
@Component
@RequiredArgsConstructor
public class AgencyAspect {

    private final AgencyValidator agencyValidator;

    @Around("@annotation(AgencyAuth)")
    public Object validate(ProceedingJoinPoint joinPoint) throws Throwable {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    private AgencyAuth getAgencyAuth(MethodSignature signature) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }
}
