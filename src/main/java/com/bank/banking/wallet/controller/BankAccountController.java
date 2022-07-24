package com.bank.banking.wallet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @RequestMapping(value = "/wallet/AccountInfoRegister.json" ,produces="application/json")
    @ResponseBody
    public Map<String,Object> accountInfoRegister(@RequestParam HashMap params) throws Exception {
        System.out.println(params);
        System.out.println("test");
        Map<String,Object> map =new HashMap<String,Object>();
        String bankNm=(String)params.get("bankName");
        String bankAccountNum=(String)params.get("accountNumber");
        map.put("bankNm",bankNm);
        map.put("bankAccountNum",bankAccountNum);
        return map;
    }

}
