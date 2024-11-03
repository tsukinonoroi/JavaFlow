package com.javastackoverflow.javaStackOverFlow.controllers;

import com.javastackoverflow.javaStackOverFlow.services.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class AdminController {

    private final TagService tagService;

    @GetMapping("/admin")
    public String Admin() {
        return "admin";
    }

    @PostMapping("/admin/tags")
    public void updateTags() {

    }
}

