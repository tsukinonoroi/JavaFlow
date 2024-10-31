package com.javastackoverflow.javaStackOverFlow.services;

import com.javastackoverflow.javaStackOverFlow.models.User;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class CurrentUserService {
    public User getCurrentUser(HttpSession session) {
        return (User) session.getAttribute("user");
    }
}