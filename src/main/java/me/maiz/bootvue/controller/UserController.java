package me.maiz.bootvue.controller;

import me.maiz.bootvue.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("api")
public class UserController {

    @RequestMapping("getUserInfo")
    public User getUserInfo(int userId){
        return new User(userId,"lucas","***",new Date());
    }


}
