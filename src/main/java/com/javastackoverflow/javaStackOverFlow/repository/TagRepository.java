package com.javastackoverflow.javaStackOverFlow.repository;

import com.javastackoverflow.javaStackOverFlow.models.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
    
}
