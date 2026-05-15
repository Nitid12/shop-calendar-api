package com.sample.interceptor;

import com.sample.common.ShopConstants;
import com.sample.domain.primary.stats.model.dto.StatsDto;
import com.sample.service.LogService;
import com.sample.service.UserService;
import java.util.Arrays;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import static com.sample.common.ShopConstants.NO_VALUE;

@Slf4j
@Component
@RequiredArgsConstructor
public class ClickInterceptor implements HandlerInterceptor {

    @Resource
    private LogService logService;

    @Resource
    private UserService userService;

    @Resource
    private ConversionService conversionService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        return false;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }
}
