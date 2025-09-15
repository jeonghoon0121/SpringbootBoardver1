package com.ohgiraffers.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/* 클래스 레벨에 @RequestMapping 어노테이션 사용이 가능하다.
*  클래스레벨에 URL을 공통 부분을 이용해 설정하고 나면
*  매번 핸들러 메소드에 URL의 중복되는 내용을 작성하지 않아도 된다.
* */
@Controller
@RequestMapping("/board/*")
public class BoardController {


    @RequestMapping(value = {"/regist"}, method = RequestMethod.POST)
    public String regist(Model model) {
        model.addAttribute("message","regist메시지");
        return "mappingResult";
    }
    @RequestMapping(value = {"/modify"}, method = RequestMethod.POST)
    public String modify(Model model) {
        model.addAttribute("message","modify메시지");
        return "mappingResult";
    }
}
