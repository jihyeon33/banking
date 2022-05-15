package com.bank.banking.wallet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class BankAccountController {
    @RequestMapping(value = "/wallet/BankAccountMain.do")
    public String doBankAccountMain(Model model){
        model.addAttribute("resultCode","성공입니다.");
        model.addAttribute("msg","은행계좌/체크카드 페이지입니다. ");
        return "/wallet/BankAccountMain";
    }
    @RequestMapping(value = "/wallet/AccountInfoRegister.json")
    public Map<String,Object> accountInfoRegister(@RequestParam HashMap params) throws Exception {
        System.out.println(params);
        System.out.println("여기");

        return params;
    }

}
