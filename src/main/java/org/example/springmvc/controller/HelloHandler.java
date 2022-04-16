package org.example.springmvc.controller;

import org.example.springmvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * <p></p>
 *
 * @author : ninggelin
 * @date : 2022-04-13 11:12
 **/
@Controller
public class HelloHandler {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        System.out.println("执行了index...");
        return "index";
    }

    @RequestMapping("/rest/{name}/{id}")
    public String rest(
            @PathVariable("name") String name,
            @PathVariable("id") int id
    ) {
        System.out.println(name);
        System.out.println(id);
        return "index";
    }

    @RequestMapping("/cookie")
    public String cookie(
            @CookieValue(value = "JSESSIONID") String sessionId
    ) {
        System.out.println(sessionId);
        return "index";
    }

    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    @RequestMapping("/save")
    public String save(User user) {
        System.out.println(user);
        return "index";
    }
}
