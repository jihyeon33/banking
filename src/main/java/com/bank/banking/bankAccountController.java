package com.bank.banking;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class bankAccountController {
    @RequestMapping(value = "/bankAccountMain.do")
    public String doBankAccountMain(Model model){
        model.addAttribute("resultCode","성공입니다.");
        model.addAttribute("msg","은행계좌/체크카드 페이지입니다. ");
        return "bankAccountMain";
    }

}
