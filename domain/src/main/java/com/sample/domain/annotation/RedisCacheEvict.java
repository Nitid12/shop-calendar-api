package com.sample.domain.annotation;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
@Documented
public @interface RedisCacheEvict {
    @AliasFor("value")
    String[] cacheNames() default {};
    @AliasFor("cacheNames")
    String[] value() default {};
    String key() default "";
    boolean clearAll() default false;

    boolean hasClassAndMethodNamePrefix() default false;
}