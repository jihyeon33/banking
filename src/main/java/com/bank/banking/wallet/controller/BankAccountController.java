package com.bank.banking.wallet.controller;

import com.bank.banking.wallet.dto.BankAccountDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;
/*
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import static org.json.simple.JSONObject.*;*/

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


    @RequestMapping(value = "/wallet/AccountInfoRegister2.json" ,produces="application/json")
    public ModelAndView accountInfoRegister2(@RequestParam HashMap params,ModelAndView mav) throws Exception {
        System.out.println(params);
        System.out.println("test2");

        String bankNm=(String)params.get("bankName");
        String bankAccountNum=(String)params.get("accountNumber");

      /*JSONArray jsonArrayList = new JSONArray();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("bankNm",bankNm);
        jsonArrayList.add(jsonObject);

        model.addAttribute("jsonArrayList","jsonArrayList");
        return "jsonView";
        */
        BankAccountDto bankAccountDto = new BankAccountDto(bankNm,bankAccountNum);
        mav.addObject("bankAccountDto",bankAccountDto);
        mav.setViewName("jsonView");

        return mav;
    }


}
