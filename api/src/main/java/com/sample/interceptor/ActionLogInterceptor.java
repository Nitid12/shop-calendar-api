package com.sample.interceptor;

import com.sample.security.TokenProvider;
import com.sample.service.LogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static com.sample.common.ShopConstants.AUTHORIZATION_HEADER;
import static com.sample.common.ShopConstants.BEARER_PREFIX;

@Component
@RequiredArgsConstructor
public class ActionLogInterceptor implements HandlerInterceptor {

    @Resource
    private LogService logService;

    @Resource
    private TokenProvider tokenProvider;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        return false;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }
}
