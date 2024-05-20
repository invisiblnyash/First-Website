package com.example.First.Website.Controller;

import com.example.First.Website.Service.userService;
import com.example.First.Website.entities.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;





@RestController
public class userController {
    @Autowired
    private userService userService;

    @PostMapping("users/addUser")
    public @ResponseBody user addUser(@RequestBody user u) {
        return this.userService.addUser(u);
    }

    @PostMapping("/users/login")
    public ResponseEntity<user> login(@RequestBody user u) {
        user u1 = userService.login(u.getUserName(), u.getPassword());
        if (u1 == null)
            return (ResponseEntity<user>) ResponseEntity.status(HttpStatus.UNAUTHORIZED);//.body("Invalid username or password");

        return ResponseEntity.ok(u);
    }
    @GetMapping("/users/findUserId/{id}")
    public @ResponseBody Optional<user> findUserById(@PathVariable Long id)
    {
        return userService.findUserById(id);
    }

//  @GetMapping("/user/getAll")
//    public @ResponseBody ArrayList<user> getAll() {
//        return userService.getAll();
 //   }

    //@GetMapping("/user/findUserId/{id}")
    //public @ResponseBody Optional<user> findUserById(@PathVariable("id") Long id) {

    //return userService.findUserById(id);

}
