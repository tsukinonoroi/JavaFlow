package com.javastackoverflow.javaStackOverFlow.repository;

import com.javastackoverflow.javaStackOverFlow.models.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {

}
