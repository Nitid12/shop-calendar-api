package com.sample.security;

import com.sample.common.exception.BusinessException;
import com.sample.common.response.ResponseCode;
import com.sample.domain.common.enums.GrantType;
import com.sample.domain.primary.user.model.entity.web.AdminUser;
import com.sample.dto.request.TokenRequest;
import com.sample.dto.response.web.WebUserResponse;
import com.sample.service.CustomUserDetails;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import java.security.Key;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;
import javax.servlet.ServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import static com.sample.common.ShopConstants.*;

@Component
@Slf4j
public class TokenProvider {

    private static final String AUTHORITIES_KEY = "auth";

    private static final String STORE_ID = "storeId";

    private final Key key;

    public TokenProvider() {
        String token = TOKEN_KEY;
        byte[] keyBites = Decoders.BASE64.decode(token);
        this.key = Keys.hmacShaKeyFor(keyBites);
    }

    public Date getTokenTime(String tokenType) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    public WebAuthToken generateUserToken(Authentication authentication, String type, TokenRequest tokenRequest,
            Optional<AdminUser> response) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

}
