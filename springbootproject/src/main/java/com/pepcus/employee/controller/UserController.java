package com.pepcus.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pepcus.employee.entities.User;
import com.pepcus.employee.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

  @Autowired
  private UserService userService;
  
  @PostMapping("/")
  public User registerUser(@RequestBody User user) {
    return userService.addUser(user);

  }
}
