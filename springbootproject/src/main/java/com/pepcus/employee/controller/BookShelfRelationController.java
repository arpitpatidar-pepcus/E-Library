package com.pepcus.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pepcus.employee.entities.BookShelfRelation;
import com.pepcus.employee.service.BookShelfService;

@RestController
@RequestMapping(value = "/bookwithshelf")
public class BookShelfRelationController {

  @Autowired
  private BookShelfService bookShelfService;
  
  @PostMapping("/")
  public String addRelation(@RequestBody BookShelfRelation bookShelfRelation) {
    return bookShelfService.addBookShelfRelation(bookShelfRelation);
    
  }
}
