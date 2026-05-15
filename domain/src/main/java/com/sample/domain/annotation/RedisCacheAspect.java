package com.sample.domain.annotation;

import lombok.RequiredArgsConstructor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.cache.CacheType;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.Objects.isNull;

@Component
@Aspect
@RequiredArgsConstructor
public class RedisCacheAspect {

    private final RedisTemplate<String, Object> redisTemplate;

    @Value("${spring.cache.type}")
    private CacheType cacheType;

    @Around("@annotation(RedisCacheable)")
    public Object cacheableProcess(ProceedingJoinPoint joinPoint) throws Throwable {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    private boolean confirmBypass() {
        return false;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    private RedisCacheable getCacheable(ProceedingJoinPoint joinPoint) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    private String generateKey(String cacheName, ProceedingJoinPoint joinPoint) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    @Around("@annotation(RedisCacheEvict)")
    public Object cacheEvictProcess(ProceedingJoinPoint joinPoint) throws Throwable {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    private RedisCacheEvict getCacheEvict(ProceedingJoinPoint joinPoint) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }
}
