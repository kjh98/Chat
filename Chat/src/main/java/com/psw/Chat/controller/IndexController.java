package com.psw.Chat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 뷰 리턴
public class IndexController {
    @GetMapping({"","/"})
    public String index() {
        return "index";
    }
}
