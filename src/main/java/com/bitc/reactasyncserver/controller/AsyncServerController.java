package com.bitc.reactasyncserver.controller;

import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/async")
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:4000"})
public class AsyncServerController {
    @RequestMapping("/")
    public String index() throws Exception {
        return "index";
    }

// 해당 주소 접근 허용
//    CORS 오류 : Cross Origin Resource Sharing의 줄임말. 동일한 주소내에서만 리소스를 공유할 수 있음
//    스프링에서는 CORS 허용을 위해서 @CrossOrigin 어노테이션을 사용하여 처리함
//    @CrossOrigin 어노테이션을 사용하면 지정한 도메인에 대해서 접근을 허용함
//    @CrossOrigin 어노테이션은 메소드, 클래스, configurer에 설정할 수 있음
//    메소드에 사용 시 지정한 메소드만 접근을 허용함
//    클래스에 사용 시 지정한 컨트롤러에 대해서만 접근을 허용함
//    configurer에 사용 시 모든 곳에 접근을 허용함
//    옵션으로 origins에 접근할 서버의 주소를 입력함


    @RequestMapping(value = "/data1", method = RequestMethod.POST)
    public Object asyncData1() throws Exception {
        return "success";
    }


    @RequestMapping(value = "/sendDataGet", method = RequestMethod.GET)
    public Object sendDataGet(@RequestParam("id") String id, @RequestParam("pw") String pw) throws Exception {
        Map<String, String> user = new HashMap<>();
        user.put("id", id);
        user.put("pw", pw);

        Map<String, Object> result = new HashMap<>();
        result.put("result", "success");
        result.put("data", user);

        return result;
    }

    @RequestMapping(value = "/sendDataPost", method = RequestMethod.POST)
    public Object sendDataPost(@RequestParam("id") String id, @RequestParam("pw") String pw) throws Exception {
        Map<String, String> user = new HashMap<>();
        user.put("id", id);
        user.put("pw", pw);

        Map<String, Object> result = new HashMap<>();
        result.put("result", "success");
        result.put("data", user);

        return result;
    }

    @RequestMapping(value = "/sendDataPut", method = RequestMethod.PUT)
    public Object sendDataPut(@RequestParam("idx") int idx) throws Exception {
        Map<String, Object> result = new HashMap<>();
        result.put("result", "success");
        result.put("idx", idx);
        return result;
    }

    @RequestMapping(value = "/sendDataDelete", method = RequestMethod.DELETE)
    public Object sendDataDelete(@RequestParam("idx") int idx) throws Exception {
        Map<String, Object> result = new HashMap<>();
        result.put("result", "success");
        result.put("idx", idx);
        return result;
    }
}
