package com.sample.common.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.Arrays;

@Getter
public enum ResponseCode {

    BAD_REQUEST(400, "CLIENT-ERR", "잘못된 요청입니다."),
    VIEW_STATS_ERROR(400, "VIEW_STATS_ERROR", "view stats 메소드 정보가 없습니다."),
    FILE_NAME_ERROR(400, "FILE_NAME_ERROR", "파일 이름에 대한 정보가 없습니다."),
    FILE_ERROR(400, "FILE_ERROR", "파일에 대한 정보가 없습니다."),
    ADMIN_EMAIL_ERROR(400, "ADMIN_EMAIL_ERROR", "유저 이메일에 대한 정보가 없습니다."),
    EVENT_REGISTER_VALID_ERROR(400, "CLIENT-ERR", "이벤트 등록/수정 중 문제가 발생했습니다. 다시 시도해주세요.", "eventInfo"),
    INVALID_PASSWORD_ERROR(401, "PASSWORD-ERR", "아이디 또는 패스워드가 올바르지 않습니다."),
    UNSUPPORTED_TOKEN(401, "UNSUPPORTED-TOKEN-ERR", "유효하지 않은 토큰입니다."),
    UNSUPPORTED_REFRESH_TOKEN(401, "UNSUPPORTED-REFRESH-TOKEN-ERR", "유효하지 않은 REFRESH 토큰입니다."),
    EXPIRED_TIME_TOKEN(401, "EXPIRED-TOKEN-ERR", "기한이 만료된 토큰입니다."),
    USER_DUPLICATE_ERROR(401, "USER-ERR", "이미 존재 하는 사용자 입니다."),
    USER_DUPLICATE_EMAIL_ERROR(401, "USER-EMAIL-ERR", "이미 존재 하는 이메일 입니다."),
    LOGOUT_USER_ERROR(401, "LOGOUT_USER-ERR", "로그아웃 된 사용자입니다."),
    USER_TOKEN_ERROR(401, "USER_TOKEN-ERR", "토큰의 유저 정보가 일치하지 않습니다."),
    DEVICE_ID_ERROR(401, "DEVICE_ID-ERR", "디바이스 아이디가 없습니다."),
    HOSTING_USER_DUPLICATE_ERROR(401, "HOSTING_USER-ERR", "이미 존재 하는 호스팅 연동 사용자 입니다."),
    USER_FREEZE_ERROR(401, "USER_FREEZE-ERR", "이용 정지된 사용자입니다."),
    FORBIDDEN_TOKEN(403, "FORBIDDEN-TOKEN-ERR", "권한 정보가 없는 토큰입니다."),
    USER_NOT_FOUND(404, "USER-ERR", "해당 유저를 찾을 수 없습니다."),
    INVITATION_NOT_FOUND(404, "INVITATION-ERR", "해당 대행내역을 찾을 수 없습니다."),
    NOTICE_NOT_FOUND(404, "NOTICE-ERR", "해당 알림을 찾을 수 없습니다."),
    FAVORITE_NOT_FOUND(404, "FAVORITE-ERR", "관심 대상이 아닙니다."),
    STORE_NOT_FOUND(404, "STORE-ERR", "해당 스토어를 찾을 수 없습니다."),
    EVENT_NOT_FOUND(404, "EVENT-ERR", "해당 이벤트를 찾을 수 없습니다."),
    COUPON_NOT_FOUND(404, "COUPON-ERR", "해당 쿠폰을 찾을 수 없습니다."),
    ITEM_NOT_FOUND(404, "ITEM-ERR", "해당 상품을 찾을 수 없습니다."),
    CERTIFICATION_ERROR(404, "CERTIFICATION-ERR", "본인 인증에 실패했습니다."),
    CERTIFICATION_TIMEOUT_ERROR(404, "CERTIFICATION_TIMEOUT-ERR", "본인 인증 시간을 초과 했습니다."),
    CERTIFICATION_MATCHING_ERROR(404, "CERTIFICATION_MATCHING-ERR", "유저의 메일과 핸드폰 번호가 일치하지 않습니다."),
    MAIL_SEND_ERROR(404, "MAIL_SEND-ERR", "메일 전송에 실패했습니다.."),
    LOG_NOT_FOUND(404, "LOG-FOUND-ERR", "해당 스토어의 로그를 찾을 수 없습니다."),
    VIEW_CLICK_LOG_NOT_FOUND(404, "VIEW_CLICK_LOG_NOT_FOUND", "뷰,클릭 로그를 찾을 수 없습니다."),
    HOSTING_USER_NOT_FOUND(404, "HOSTING_USER-ERR", "호스팅 연동 된 유저를 찾을 수 없습니다."),
    SERVER_ERROR(500, "SERVER-ERR", "잠시 후 다시 시도해주세요."),
    FAVORITE_COUPON_DUPLICATE_ERROR(500, "COUPON-ERR", "해당 쿠폰은 이미 발급받았습니다."),
    FAVORITE_DUPLICATE_ERROR(500, "FAVORITE-ERR", "이미 관심 설정 되어 있습니다."),
    USER_NOTICE_ERROR(500, "USER_NOTICE-ERR", "유저에 해당하는 알림이 없습니다."),
    REFRESH_TOKEN_ERROR(500, "REFRESH_TOKEN-ERR", "토큰 저장에 실패했습니다."),
    EP_URL_ERROR(500, "REFRESH_TOKEN-ERR", "URL 정보가 잘못되었습니다."),
    EP_KEY_ERROR(500, "REFRESH_TOKEN-ERR", "KEY 정보가 잘못되었습니다."),
    HOSTING_REFRESH_TOKEN_ERROR(500, "HOSTING_REFRESH_TOKEN-ERR", "호스팅 연동 중 토큰 저장에 실패했습니다."),
    AGENCY_AUTH_ERROR(500, "AGENCY-ERR", "대행 권한이 없습니다."),
    ADMIN_AUTH_ERROR(500, "ADMIN-ERR", "최고관리자 권한이 없습니다."),
    UPDATE_ITEM_ERROR(500, "UPDATE_ITEM-ERR", "상품 갱신에 실패 하였습니다."),
    UPDATE_STORE_ERROR(500, "UPDATE_STORE-ERR", "상점 갱신에 실패 하였습니다."),
    NOTICE_ERROR(500, "NOTICE-ERR", "해당하는 알림이 없습니다."),
    FAQ_ERROR(500, "FAQ_ERROR", "해당하는 FAQ 정보가 없습니다."),
    FAQ_CATEGORY_ERROR(500, "FAQ_CATEGORY_ERROR", "해당하는 FAQ CATEGORY 정보가 없습니다."),
    CAMPAIGN_NOT_FOUND_ERROR(500, "CAMPAIGN_NOT_FOUND_ERROR", "해당하는 캠페인 정보가 없습니다."),
    SNS_USER_ERROR(500, "SNS_USER_ERROR", "소셜 로그인의 경우 정보 변경이 불가능합니다."),
    VALIDATION_ERROR(500, "VALIDATION_ERROR", "List 객체들의 필수 값을 확인하세요."),
    CATEGORY_ERROR(500, "CATEGORY_ERROR", "해당하는 CATEGORY 정보가 없습니다."),
    KEY_DECRYPT_ERROR(500, "KEY_DECRYPT_ERROR", "복호화에 실패했습니다. 키를 확인해주세요."),
    SUCCESS_INSERT(201, "INSERT-SUCCESS", "등록 성공 하였습니다."),
    SUCCESS_UPDATE(201, "UPDATE-SUCCESS", "수정 성공 하였습니다."),
    SUCCESS_DELETE(204, "DELETE-SUCCESS", "삭제 성공 하였습니다."),
    SUCCESS_SELECT(200, "SELECT-SUCCESS", "조회 성공 하였습니다."),
    SUCCESS_VERIFICATION(200, "VERIFICATION-SUCCESS", "본인인증에 성공 하였습니다."),
    SUCCESS_ITEM_UPDATE(201, "UPDATE_SUCCESS", "상품 갱신에 성공 하였습니다.");

    private final int status;

    private final String code;

    private final String message;

    private String className;

    ResponseCode(int status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    ResponseCode(int status, String code, String message, String className) {
        this.status = status;
        this.code = code;
        this.message = message;
        this.className = className;
    }

    /**
     * BindException 발생 시 발생한 클래스에 따른 에러 처리를 위한 메서드
     * 찾은 값중 VALID가 있으면 리턴. 없을시 기본 BAD_REQUEST 리턴
     * @param className
     * @return
     */
    public static ResponseCode getResponseCodeForInvalid(String className) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    public static boolean isValidResponseCode(ResponseCode code, String className) {
        return false;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }
}
