package com.example.First.Website.Controller;
import com.example.First.Website.Service.userService;
import com.example.First.Website.entities.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class userController {
    @Autowired
    private  userService userService;

    @PostMapping("users/addUser")
    public @ResponseBody user addUser(@RequestBody  user u)
    {
        return this.userService.addUser(u);
    }

}
