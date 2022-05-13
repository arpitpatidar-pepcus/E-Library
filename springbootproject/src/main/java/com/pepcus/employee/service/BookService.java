package com.pepcus.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pepcus.employee.entities.Books;
import com.pepcus.employee.repository.BookRepository;

@Service
public class BookService {

  @Autowired
  BookRepository bookRepository;
  public List<Books> addBooks(List<Books> books) {
    
    return (List<Books>)bookRepository.saveAll(books);
  }

}
