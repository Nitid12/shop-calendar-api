package com.sample.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.net.UnknownHostException;

@RestController
@Slf4j
@RequestMapping(value = { "app/system", "loca/system" })
@RequiredArgsConstructor
@Tag(name = "System API", description = "시스템 API")
public class SystemController {

    @GetMapping(value = "/health-check")
    @ResponseBody
    public Object isRun() throws UnknownHostException {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

}
