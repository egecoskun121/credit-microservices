package com.egecoskun121.credit.services;

import com.egecoskun121.credit.model.entity.User;
import com.egecoskun121.credit.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService  {

    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User signUp(User user){

        return userRepository.save(user);
    }
}
