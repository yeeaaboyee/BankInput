package com.micha.BankInput;

import com.micha.BankInput.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {

    @GetMapping("/addUser")
    public String sendForm(User user) {

        return "addUser";
    }

    @PostMapping("/addUser")
    public String processForm(User user) {

        return "adduser";
    }
}