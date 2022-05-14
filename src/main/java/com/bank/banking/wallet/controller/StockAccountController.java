package com.bank.banking.wallet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StockAccountController {

    @RequestMapping(value="/wallet/StockAccountMain.do")
    public String doStockAccountMain(Model model){
        model.addAttribute("resultCode","성공입니다.");
        model.addAttribute("msg","주식계좌 페이집입니다.");
        return "/wallet/StockAccountMain";
    }
}
