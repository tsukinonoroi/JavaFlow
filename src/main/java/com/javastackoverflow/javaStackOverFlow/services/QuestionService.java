package com.javastackoverflow.javaStackOverFlow.services;

import com.javastackoverflow.javaStackOverFlow.models.Question;
import com.javastackoverflow.javaStackOverFlow.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class QuestionService {

    private final QuestionRepository questionRepository;

    public List<Question> getLatestQuestions() {
        return questionRepository.findTop5ByOrderByDateOfCreatedDesc();
    }

    public Question createQuestion(Question question) {
        return questionRepository.save(question); // Сохраняем новый вопрос
    }
//
//    public Question createQuetion() {
//        return questionRepository
//    }
}
