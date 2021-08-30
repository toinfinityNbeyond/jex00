package com.example.controller;

import com.example.service.Hello;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class SampleController {

    @Autowired  // 자동으로 엮어준다. 의존성을 주입하는 역할
    private Hello hello; // 헬로 서비스 주입

    @GetMapping("/hello")
    public void hello() {

        log.info("hello------------");
        log.info("hello------------");
        log.info(hello); // hello 가 제대로 주입됬나 확인.
        log.info("hello------------");
        log.info("hello------------");
    }
}
