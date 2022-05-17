package com.pepcus.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pepcus.employee.entities.UserBookRelation;
import com.pepcus.employee.repository.BookRepository;
import com.pepcus.employee.repository.UserBookRelationRepository;
import com.pepcus.employee.repository.UserRepository;

@Service
public class UserBookRelationService {

  @Autowired
  UserRepository userRepository;
  @Autowired
  BookRepository bookRepository;
  @Autowired
  UserBookRelationRepository userBookRelationRepository;

  public String bookUpdate(UserBookRelation userBookRelation) {

    if (!userRepository.existsById(userBookRelation.getUserId())) {
      return "UserDoes not exist";
    }
    if (!bookRepository.existsById(userBookRelation.getBookId())) {
      return "Book is not available at the moment";
    }
    userBookRelationRepository.save(userBookRelation);
    return "Details for issued book updated";
  }

}
