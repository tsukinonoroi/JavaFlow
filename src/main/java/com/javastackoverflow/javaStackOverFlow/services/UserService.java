package com.javastackoverflow.javaStackOverFlow.services;

import com.javastackoverflow.javaStackOverFlow.models.Enum.Role;
import com.javastackoverflow.javaStackOverFlow.models.User;
import com.javastackoverflow.javaStackOverFlow.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService  {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public String registerUser(User user) {

        if (!isUserUniqueEmail(user) && !isUserUniqueUsername(user)) {
            log.info("Email и Username уже используются");
            return "both";
        } else if (!isUserUniqueEmail(user)) {
            log.info("Email уже используется");
            return "email";
        } else if (!isUserUniqueUsername(user)) {
            log.info("Username уже используется");
            return "username";
        }

        createUser(user);
        return "success";
    }

    @Transactional
    public boolean createUser(User user) {
        if (userRepository.findByEmail(user.getEmail()) != null) return false;
        user.setActive(true);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.getRoles().add(Role.ROLE_ADMIN);

        userRepository.save(user);
        log.info("Сохранили нового пользователя с email " + user.getEmail() + " и username " + user.getUsername());
        return true;
    }

    public boolean isUserUniqueEmail (User user) {
        return userRepository.findByEmail(user.getEmail()) == null;
    }

    public boolean isUserUniqueUsername(User user) {
        return userRepository.findByUsername(user.getUsername()) == null;
    }


    /*public createTheme(){

    }*/
}


