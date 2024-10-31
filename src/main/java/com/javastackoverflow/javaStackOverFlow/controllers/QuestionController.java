package com.javastackoverflow.javaStackOverFlow.controllers;

import com.javastackoverflow.javaStackOverFlow.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuestionController {
    QuestionRepository questionRepository;

}
