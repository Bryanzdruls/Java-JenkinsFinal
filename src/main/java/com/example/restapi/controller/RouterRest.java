package com.example.restapi.controller;

import com.example.restapi.repository.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RouterRest {

    public void ameThod(){
        throw new UnsupportedOperationException("Not supported yet");
    }

    public void newMethod(){
        throw new UnsupportedOperationException("Not supported yet");
    }
    @GetMapping("/get-users")
    public List<User> getUsers(){
        List<User> users = new ArrayList<>();
        users.add(new User("1023","Brian","eltiobryanz@gmail.com"));
        users.add(new User("1021","Juan","JJGG@gmail.com"));
        users.add(new User("1023","Lucho","lucho:)@gmail.com"));
        return users;
    }

    @PostMapping("/add-user")
    public User addUser(@RequestBody  User user){
        return new User(user.getId(), user.getName(), user.getEmail());
    }
}
