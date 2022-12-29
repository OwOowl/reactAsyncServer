package com.bitc.reactasyncserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AsyncServerController {
    @RequestMapping("/")
    public String index() throws Exception {
        return "index";
    }

// 해당 주소 접근 허용
    @CrossOrigin(origins = "http://localhost:3000")
    @ResponseBody
    @RequestMapping(value = "/async/data1", method = RequestMethod.POST)
    public String asyncData1() throws Exception {
        return "서버와 통신 성공";
    }
}
