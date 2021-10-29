package egovframework.example.cmmn.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class TestController {
    
    @RequestMapping(value="/main.do")
    public String mainDo(){
        return "view/main";
    }
}
