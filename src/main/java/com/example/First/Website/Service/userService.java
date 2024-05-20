package com.example.First.Website.Service;

import com.example.First.Website.entities.user;
import com.example.First.Website.repositery.userRepository;
import jakarta.persistence.EntityNotFoundException;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jdbc.core.JdbcAggregateOperations;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class userService {
    @Autowired
    private userRepository userRepository;

    public user addUser(user u) {
        return userRepository.save(u);
    }


//    public boolean updateUserPassword(String username, String encodedPassword) {
//        User user = userRepository.findUserByUserName();
//        if (user != null) {
//            user.setPassword(encodedPassword);
//            userRepository.save(user);
//            return true;
//        }
//        return false;
//    }

    public user login(String userName, String password) {
        ArrayList<user> myList = (ArrayList<user>) userRepository.findAll();
        System.out.println("Size: " + myList.size());
        for (int i = 0; i < myList.size(); i++) {
            if ((myList.get(i).getUserName().equals(userName) && myList.get(i).getPassword().equals(password))) {
                System.out.println(myList.get(i).getPassword());
                return myList.get(i);
            }
        }
        System.out.println(myList.get(0).getPassword());
        return new user(); // myList.get(-1);

    }

    public Optional<user> findUserByUserName(Long id) {
        return userRepository.findById(id);


    }

    public Optional<user> findUserById(Long id) {
        return userRepository.findById(id);

    }
}
