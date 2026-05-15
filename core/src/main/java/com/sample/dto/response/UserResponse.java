package com.sample.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class UserResponse {

    @Schema(description = "사용자 ID", defaultValue = "1")
    private Long id;
    @Schema(description = "계정 이름", defaultValue = "test")
    private String accountName;
    @Schema(description = "계정 비밀번호", defaultValue = "test1234")
    private String accountPassword;
    @Schema(description = "사용자 이메일", defaultValue = "test@gmail.com")
    private String userEml;
    @Schema(description = "사용자 전화번호", defaultValue = "01012345678")
    private String phone;
    @Schema(description = "이름", defaultValue = "강세종")
    private String name;
    @Schema(description = "성별", defaultValue = "M")
    private String gender;
    @Schema(description = "생년월일", defaultValue = "19930101")
    private LocalDate birth;
    @Schema(description = "알림 설정 여부", defaultValue = "true")
    private boolean noticeActivated;
    @Schema(description = "디바이스 아이디", defaultValue = "0")
    private Long deviceId;

    @Builder
    public UserResponse(Long id, String accountName, String accountPassword, String userEml, String phone,
                        String name, String gender, LocalDate birth, boolean noticeActivated, Long deviceId) {
        this.id = id;
        this.accountName = accountName;
        this.accountPassword = accountPassword;
        this.userEml = userEml;
        this.phone = phone;
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.noticeActivated = noticeActivated;
        this.deviceId = deviceId;
    }
}
