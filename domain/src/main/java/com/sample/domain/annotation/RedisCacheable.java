package com.sample.domain.annotation;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
@Documented
public @interface RedisCacheable {

    @AliasFor("value")
    String cacheName() default "";

    @AliasFor("cacheName")
    String value() default "";

    String key() default "";

    long expireSecond() default 300L;

    boolean hasClassAndMethodNamePrefix() default false;

    boolean onlyPublic() default false;
}