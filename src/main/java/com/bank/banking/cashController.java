package com.bank.banking;

import com.bank.banking.dto.requestDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class cashController {
    @RequestMapping(value= "/cashMain.do")
    @ResponseBody
    public String doCashMain(@ModelAttribute requestDto param, Model model){
        String resultCode=param.getResultCode();
        String msg=param.getMsg();
        model.addAttribute("resultCode",resultCode);
        model.addAttribute("msg",msg);
        return "cashMain";
    }
}
