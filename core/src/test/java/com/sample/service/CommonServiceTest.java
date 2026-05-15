package com.sample.service;

import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import com.sample.common.exception.BusinessException;
import com.sample.domain.primary.user.model.entity.User;
import com.sample.domain.primary.user.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@ExtendWith(MockitoExtension.class)
public class CommonServiceTest {

    @InjectMocks
    private CommonService commonService;

    @Mock
    private UserRepository userRepository;

    User user;

    @Nested
    @DisplayName("회원/비회원 여부를 체크하는 메소드")
    class checkUserInfo {

        @BeforeEach
        void getUserInfo() {
            // TODO: 보안 정책상 비공개 처리된 로직입니다.
        }

        @Test
        @DisplayName("회원 정보가 들어올 경우 회원 아이디를 반환한다.")
        void isAPPUser() {
            // TODO: 보안 정책상 비공개 처리된 로직입니다.
        }

        @Test
        @DisplayName("비회원 정보가 들어올 경우 Exception을 던진다.")
        void isPublicUser() {
            // TODO: 보안 정책상 비공개 처리된 로직입니다.
        }
    }
}
