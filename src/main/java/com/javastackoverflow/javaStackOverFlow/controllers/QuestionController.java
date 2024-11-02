package com.javastackoverflow.javaStackOverFlow.controllers;

import com.javastackoverflow.javaStackOverFlow.repository.QuestionRepository;
import com.javastackoverflow.javaStackOverFlow.services.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionService questionService;

}
