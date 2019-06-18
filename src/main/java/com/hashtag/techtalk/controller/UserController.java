package com.hashtag.techtalk.controller;

import com.hashtag.techtalk.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping(value = "/addUser")
    public String addUser(@RequestBody User userdata) {

        System.out.println(userdata);
        System.out.println("Updated the code in Github");
        return "User Data reached the Server and was saved successfully : " + userdata;

    }

   /* public boolean isUserPresent(){

    }*/

}
