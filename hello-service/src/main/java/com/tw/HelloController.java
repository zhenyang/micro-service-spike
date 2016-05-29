package com.tw;

import com.tw.clients.DateClient;
import com.tw.clients.TimeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloController {
    @Autowired
    private DateClient dateClien;

    @Autowired
    private TimeClient timeClien;

    @RequestMapping(value = "hello/{name}", method = RequestMethod.GET)
    public String sayHello(@PathVariable(value = "name") String name) {
        String date = dateClien.getDate();
        String time = timeClien.getTime();
        return "Hello " + name + ", " + "today is " + date + " and time now is " + time;
    }
}
