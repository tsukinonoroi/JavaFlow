package com.javastackoverflow.javaStackOverFlow.services;

import com.javastackoverflow.javaStackOverFlow.models.Question;
import com.javastackoverflow.javaStackOverFlow.repository.QuestionRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.hibernate.sql.exec.ExecutionException;
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
        return questionRepository.save(question);
    }

    public Question getQuestion(Long id) {
        return questionRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Вопрос не найден"));
    }
}
