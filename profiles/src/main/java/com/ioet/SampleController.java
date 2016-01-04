package com.ioet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by rene on 04/01/16.
 */
@Controller
@EnableAutoConfiguration
public class SampleController {

    @Value("${doge.wow}")
    private String name;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World! " + name;
    }

}
