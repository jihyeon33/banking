package com.bank.banking.wallet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CashController {
    @RequestMapping(value= "/wallet/CashMain.do")
    public String doCashMain(Model model){
        model.addAttribute("resultCode","성공입니다.");
        model.addAttribute("msg","현금 페이지 입니다.");
        return "/wallet/CashMain";
    }
}
