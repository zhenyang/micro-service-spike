package com.tw;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConfigController {

    @Value("${app.message}")
    private String message;

    @RequestMapping(method = RequestMethod.GET)
    public String getMessage() {
        return message;
    }
}
