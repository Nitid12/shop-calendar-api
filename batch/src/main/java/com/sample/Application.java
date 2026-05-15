package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@SpringBootApplication
@EnableFeignClients
@EnableScheduling
public class Application {

    public static void main(String[] args) throws TelegramApiException {
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }
}
