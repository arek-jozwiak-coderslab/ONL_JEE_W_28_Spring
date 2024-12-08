package pl.coderslab.web;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.time.LocalDateTime;
import java.util.Random;

@Controller
public class SessionController {

    @GetMapping(value = "/session-test")
    @ResponseBody
    public String loginStart( HttpSession session) {
        String loginStart = (String) session.getAttribute("loginStart");
        if (loginStart == null) {
            session.setAttribute("loginStart", "Session start time: " + LocalDateTime.now());
        }
        return "Session start time: " + loginStart;
    }
}
