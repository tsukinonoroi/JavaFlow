package com.javastackoverflow.javaStackOverFlow.controllers;


import com.javastackoverflow.javaStackOverFlow.models.Question;
import com.javastackoverflow.javaStackOverFlow.models.User;
import com.javastackoverflow.javaStackOverFlow.services.QuestionService;
import com.javastackoverflow.javaStackOverFlow.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final QuestionService questionService;

    @GetMapping("/")
    public String main(Model model) {
        List<Question> questionList = questionService.getLatestQuestions();
        model.addAttribute("questionList", questionList);
        return "main";
    }

    @GetMapping("/auth/login")
    public String login() {
        return "login";
    }

    @GetMapping("/auth/registration")
    public String registration() {
        return "registration";
    }

    @PostMapping("/auth/registration")
    public String createUser(User user, Model model) {
        String result = userService.registerUser(user);

        if ("email".equals(result)) {
            model.addAttribute("emailError", "Email уже используется");
            return "registration";
        } else if ("username".equals(result)) {
            model.addAttribute("usernameError", "Username уже используется");
            return "registration";
        } else if ("both".equals(result)) {
            model.addAttribute("bothError", "Email и Username уже используются");
            return "registration";
        }

        return "redirect:/auth/login";
    }

}


