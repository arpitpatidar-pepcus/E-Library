package com.pepcus.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pepcus.employee.entities.UserBookRelation;
import com.pepcus.employee.service.UserBookRelationService;

@RestController
@RequestMapping(value = "/issuebook")
public class UserBookRelationController {

  @Autowired
  private UserBookRelationService userBookRelationService;

  @PostMapping("/")
  public String registerUser(@RequestBody UserBookRelation userBookRelation) {
    System.out.println("git test line");

    return userBookRelationService.bookUpdate(userBookRelation);
  }
}
