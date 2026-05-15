package com.sample.feign.firebase;

import feign.Response;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Map;

@FeignClient(name = "pushNoticeApiFeignClient"
        , url = "${feign.push-api.url}"
        , configuration = {FeignAutoConfiguration.class}
)
public interface PushNoticeApiInterface {

    @PostMapping(value = "/sampleapp-6029b/messages:send")
    Response postPush(@RequestHeader Map<String, String> headerMap, @RequestBody String jsonObject);

}
