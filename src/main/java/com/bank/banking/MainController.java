package com.bank.banking;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MainController {
    @RequestMapping(value="/")
    public String index(Model model){
        model.addAttribute("test", "Hello world! This is Spring MVC project by using IntelliJ");
        return "index";
    }

    @RequestMapping(value="/main.do")
    public String doMain(Model model){
        model.addAttribute("cash","현금");
        model.addAttribute("bankAccount","은행계좌/체크카드");
        model.addAttribute("stockAccount","주식계좌");
        return "main";
    }

    @RequestMapping(value="/json",produces="application/json")
    @ResponseBody
    public Object json(){
        Map<String, String> m = new HashMap<>();
        m.put("test","Hello world!(/json) This is Spring MVC project by using IntelliJ");
        return m;
    }
}
