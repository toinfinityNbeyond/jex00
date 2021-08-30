package com.example.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/board/*")   //보드로 들어오는 애들은 잡아라?
@Log4j2
public class BoardController {

    @GetMapping ("/list")//get방식으로 들어오면 동작. 경로가 /board/list가 된다.
     // void를 쓰면 호출한 경로의 jsp를 찾는다.

    public void list() {
        log.info("list-------------------------");
        log.info("list-------------------------");
        log.info("list-------------------------");
        log.info("list-------------------------");

    }
}
