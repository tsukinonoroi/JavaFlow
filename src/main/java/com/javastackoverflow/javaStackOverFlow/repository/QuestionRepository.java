package com.javastackoverflow.javaStackOverFlow.repository;

import com.javastackoverflow.javaStackOverFlow.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    Question findByTop(String top);

    List<Question> findTop5ByOrderByDateOfCreatedDesc();


}
