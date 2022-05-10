package hello.typeconverter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @GetMapping("/hello-v1")
    public String helloV1(HttpServletRequest request) {
        String data = request.getParameter("data"); // 쿼리 파라미터 조회 -> 문자 타입 조회
        Integer intValue = Integer.valueOf(data); // 문자 -> 숫자 타입으로 변경
        System.out.println("intValue = " + intValue);
        return "ok";
    }

    @GetMapping("/hello-v2")
    public String helloV2(@RequestParam Integer data) { // Spring : @RequestParam 을 통해 숫자 타입으로 편리하게 받음
        System.out.println("data = " + data);
        return "ok";
    }
}
