package com.lombardrisk.springmvcsample.web;

import com.lombardrisk.springmvcsample.domain.User;
import com.lombardrisk.springmvcsample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: johnson
 * Date: 1/3/12
 * Time: 12:54 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller(value = "basicController")
public class BasicController {
    @Autowired
    private UserService userService;

    @RequestMapping("/helloWorld")
    public String helloWorld(Model model) {
        model.addAttribute("message", "Hello World!");
        return "helloWorld";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public @ResponseBody List<User> getUsers() {
        return userService.getUsers();
    }
}
