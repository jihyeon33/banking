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
    public String doCashMain(Model model){
        model.addAttribute("resultCode","성공입니다.");
        model.addAttribute("msg","현금 페이지 입니다.");
        return "cashMain";
    }
}
