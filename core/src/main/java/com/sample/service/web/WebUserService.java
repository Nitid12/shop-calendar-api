package com.sample.service.web;

import com.sample.common.exception.BusinessException;
import com.sample.common.response.ResponseCode;
import com.sample.domain.common.enums.GrantType;
import com.sample.domain.primary.stats.model.dto.PartnerDetailsDto;
import com.sample.domain.primary.store.model.embedded.Period;
import com.sample.domain.primary.store.model.entity.Store;
import com.sample.domain.primary.store.repository.ItemRepository;
import com.sample.domain.primary.store.repository.StoreRepository;
import com.sample.domain.primary.user.model.dto.web.CountByDateDto;
import com.sample.domain.primary.user.model.dto.web.WebUserDto;
import com.sample.domain.primary.user.model.dto.web.WebUserInfo;
import com.sample.domain.primary.user.model.entity.web.AdminUser;
import com.sample.domain.primary.user.repository.web.WebUserRepository;
import com.sample.dto.request.ManagerRequest;
import com.sample.dto.response.web.WebPrivacyResponse;
import com.sample.dto.response.web.WebUserResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import static com.sample.common.ShopConstants.CAFE_24_RECOG_ID;
import static com.sample.common.response.ResponseCode.STORE_NOT_FOUND;
import static com.sample.common.response.ResponseCode.USER_NOT_FOUND;

@Slf4j
@Service
@RequiredArgsConstructor
public class WebUserService {

    /**
     * [보안 비공개 로직]
     * 사용자 정보 처리 프로세스
     * 1. 전달받은 사용자 식별자 기반 상태 및 권한 조회
     * 2. 외부 연동 시스템(SNS 등)과의 상태 동기화 처리
     * 3. 요청된 형식에 맞춰 사용자 정보 가공 및 반환
     */
    public WebPrivacyResponse getPrivacySettingsInfo(UserDetails userDetails) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

}
