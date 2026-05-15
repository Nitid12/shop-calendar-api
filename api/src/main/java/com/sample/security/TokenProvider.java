package com.sample.security;

import com.sample.common.ShopConstants;
import com.sample.dto.request.TokenRequest;
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
import javax.servlet.ServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TokenProvider {

    private static final String AUTHORITIES_KEY = "auth";

    private final Key key;


    public Date getTokenTime(String tokenType, Boolean userType) {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    public TokenProvider() {
        String key = ShopConstants.TOKEN_KEY;
        byte[] keyBites = Decoders.BASE64.decode(key);
        this.key = Keys.hmacShaKeyFor(keyBites);
    }

}
