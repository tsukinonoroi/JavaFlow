package com.javastackoverflow.javaStackOverFlow.repository;


import com.javastackoverflow.javaStackOverFlow.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository <User, Long>{
    User findByUsername(String username);
    User findByEmail(String email);

    User deleteUserById(Long id);

}
