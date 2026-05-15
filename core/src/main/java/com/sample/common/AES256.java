package com.sample.common;

import com.sample.utils.PropertyUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import static com.sample.common.ShopConstants.ALG;
import static com.sample.common.ShopConstants.ECB;
import static com.sample.common.ShopConstants.IV_VAL;

@Slf4j
public class AES256 {

    public static String alg = ALG;

    public static String ecb = ECB;

    private final String key = "abc";

    private final String iv = IV_VAL;

    @Value("${lotte.key}")
    private String digilocaKey = PropertyUtils.getString("lotte.key");

    public String encrypt(String text) throws Exception {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    public String decrypt(String cipherText) throws Exception {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

    public String digilocaDecrypt(String cipherText) throws Exception {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }
}
