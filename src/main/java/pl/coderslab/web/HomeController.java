package pl.coderslab.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/mechanic")
public class HomeController {

    private static final Logger logger
            = LoggerFactory.getLogger(HomeController.class);


    //admin/mechanic/show

    @GetMapping("/show")
//    @ResponseBody
    public String hell(){
        int a = 12;
        logger.info("some info {}", a);

        return "redirect:/admin/mechanic/show-me";
    }

    //user/show-me

    @GetMapping("/show-me")
    public String showMe(){
        return "Hello World";
    }

    @GetMapping("/test")

    public String test(){
        return "aaaa qqqqqqqqq";
    }


}
