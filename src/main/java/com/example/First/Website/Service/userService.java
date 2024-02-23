package com.example.First.Website.Service;

import com.example.First.Website.entities.user;
import com.example.First.Website.repositery.userRepository;
import org.springframework.stereotype.Service;

@Service
public class userService {

    private userRepository userRepository;

    public  user addUser(user u )
    {
        return userRepository.save(u);
    }
}
