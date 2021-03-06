package com.demo.controller;

import com.demo.servicce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = {"/user"})
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/findAllPerson"},produces = {"application/json;charset=UTF-8"},method = RequestMethod.GET)
    public List getAllUsers(){
        List list =  userService.findAllUser();
        return list;
    }


}
