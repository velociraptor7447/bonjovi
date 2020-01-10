package com.example.bonjovi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class BonjoviApplication {

    @RequestMapping("/hello")
    @ResponseBody
    String index() {
        return MySQLConnect.connect();
    }

    public static void main(final String[] args) {
        SpringApplication.run(BonjoviApplication.class, args);
    }
}
