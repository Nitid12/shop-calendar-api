package com.sample.service;

import com.sample.common.ShopConstants;
import com.sample.common.exception.BusinessException;
import com.sample.common.response.ResponseCode;
import com.sample.domain.common.enums.GrantType;
import com.sample.domain.common.enums.HostingType;
import com.sample.domain.common.enums.UsageStatusType;
import com.sample.domain.primary.store.model.dto.web.EpInfo;
import com.sample.domain.primary.store.model.dto.web.StoreInfo;
import com.sample.domain.primary.store.model.embedded.BusinessInfo;
import com.sample.domain.primary.store.model.entity.Store;
import com.sample.domain.primary.store.repository.StoreRepository;
import com.sample.domain.primary.user.model.entity.AdminNotice;
import com.sample.domain.primary.user.model.entity.web.AdminMail;
import com.sample.domain.primary.user.model.entity.web.AdminRefToken;
import com.sample.domain.primary.user.model.entity.web.AdminUser;
import com.sample.domain.primary.user.repository.AdminNoticeRepository;
import com.sample.domain.primary.user.repository.web.WebEmailRepository;
import com.sample.domain.primary.user.repository.web.WebRefTokenRepository;
import com.sample.domain.primary.user.repository.web.WebUserRepository;
import com.sample.dto.request.*;
import com.sample.dto.request.web.WebHostingSignUpRequest;
import com.sample.dto.request.web.WebLoginRequest;
import com.sample.dto.request.web.WebPwdRequest;
import com.sample.dto.response.web.WebRefreshTokenResponse;
import com.sample.dto.response.web.WebUserResponse;
import com.sample.feign.cafe24.response.StoreDTO;
import com.sample.feign.telegram.TelegramBotApiInterface;
import com.sample.security.TokenProvider;
import com.sample.security.WebAuthToken;
import com.sample.service.web.WebEmailService;
import io.jsonwebtoken.Claims;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Random;
import static com.sample.common.ShopConstants.*;

@Slf4j
@Service
@RequiredArgsConstructor
public class WebAuthService {

    private static final String LOGIN_STR = "login";

    private static final String REISSUE_STR = "reissue";

    private static final String HOSTING_STR = "hosting";

    @Value("${telegram.chat-id}")
    private String teleChatId;

    @Transactional
    public void signUp(PartnerAuthRequest request) {
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

}
