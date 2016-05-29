package com.tw.clients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("date-service")
public interface DateClient {
    @RequestMapping(value = "date", method = RequestMethod.GET)
    String getDate();
}
