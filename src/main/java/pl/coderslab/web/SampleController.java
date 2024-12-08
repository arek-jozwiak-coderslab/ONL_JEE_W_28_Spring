package pl.coderslab.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.Random;

@RestController
public class SampleController {
    Logger logger = LoggerFactory.getLogger(SampleController.class);

    private final BookDao bookDao;

    public SampleController(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @RequestMapping("/sample-save")
    @ResponseBody
    public String home(){
        Book book = new Book();
        book.setTitleBook("Thinking in Java");
        book.setAuthor("Bruce Eckel");
        bookDao.saveBook(book);
        Long id = book.getId();
        return "saved";
    }

    @GetMapping(value = "/random/{max}/{min}")
    public String maxRandomValue(@PathVariable int max, @PathVariable int min) {
        Random random = new Random();
        int randomNumberSelected = random.nextInt(max - min + 1) + min;
        return "Wylosowano liczbę: " + randomNumberSelected;
    }

    @RequestMapping("/cookieGet")
    @ResponseBody
    public String home(HttpServletRequest request){
        Cookie c = WebUtils.getCookie(request, "cookie2");
        return "cookie: " + c.getValue();
    }
}
