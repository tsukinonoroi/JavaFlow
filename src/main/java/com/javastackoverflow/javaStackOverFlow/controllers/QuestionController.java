package com.javastackoverflow.javaStackOverFlow.controllers;

import com.javastackoverflow.javaStackOverFlow.models.Question;
import com.javastackoverflow.javaStackOverFlow.services.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/question")
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping("/{id}")
    public String getQuestion(@PathVariable Long id, Model model) {
        Question question = questionService.getQuestion(id);
        model.addAttribute("question", question);
        return "question";
    }

    @PostMapping("/create")
    public String createQuestion(@ModelAttribute Question question) {
        Question newQuestion = questionService.createQuestion(question);
        return "redirect:/question/" + newQuestion.getId();
    }

}
