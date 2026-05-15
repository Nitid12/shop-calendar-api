package com.sample.interceptor;

import com.sample.domain.common.enums.ViewType;
import com.sample.domain.primary.stats.model.dto.StatsDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import javax.servlet.http.HttpServletRequest;
import static com.sample.common.ShopConstants.NO_VALUE;

@Component
public class ClickParamConvertor implements Converter<HttpServletRequest, StatsDto> {

    public static final String VIEW_ID = "view-id";

    public static final String DEVICE_ID = "device-id";

    public static final String STORE_ID = "store-id";

    public static final String VIEW_TYPE = "view-type";

    public static final String LOCATION = "location";

    @Override
    public StatsDto convert(HttpServletRequest source) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    private static Long checkParameter(HttpServletRequest request, String paramValue) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }
}
