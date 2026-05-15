package com.sample.feign.file;

import feign.Headers;
import feign.Response;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;

import java.io.File;

@FeignClient(name = "fileApiFeignClient"
, url = "${feign.file-post-api.url}"
, configuration = {FeignAutoConfiguration.class})
public interface FileApiInterface {

    @PostMapping(value = "/upload?token={token}", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @Headers("Content-Type: multipart/form-data")
    Response uploadFile(@RequestPart(value = "file") File file,@RequestPart(value = "folder") String folder,@PathVariable("token")String token);

}
