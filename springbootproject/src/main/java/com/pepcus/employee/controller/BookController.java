package com.pepcus.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pepcus.employee.entities.Books;
import com.pepcus.employee.service.BookService;

@RestController
@RequestMapping(value = "/book")
public class BookController {

  @Autowired
  private BookService bookService;
  
//  @PostMapping("/")
//  public List<Books> saveBooks(@RequestBody List<Books> books) {    
//    return bookService.addBooks(books);
//  } 
 
}
