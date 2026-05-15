package com.sample.controller;

import com.sample.common.response.CommonResponse;
import com.sample.common.response.ResponseCode;
import com.sample.domain.common.enums.FileType;
import com.sample.service.StatsService;
import com.sample.service.web.WebFileService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.net.InetAddress;
import java.net.UnknownHostException;

@Slf4j
@RestController
@RequestMapping(value = "web/system")
@RequiredArgsConstructor
@Tag(name = "System API", description = "시스템 API")
public class SystemController {

    private final WebFileService webFileService;

    private final StatsService statsService;

    @GetMapping(value = "/health-check")
    @ResponseBody
    public Object isRun() throws UnknownHostException {
        return null;
        // TODO: 보안 정책상 비공개 처리된 로직입니다.
    }

}
