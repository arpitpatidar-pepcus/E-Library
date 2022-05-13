package com.pepcus.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pepcus.employee.entities.BookShelfRelation;
import com.pepcus.employee.repository.BookRepository;
import com.pepcus.employee.repository.BookShelfRelationRepository;
import com.pepcus.employee.repository.ShelvesRepository;

@Service
public class BookShelfService {

  
  @Autowired
  BookShelfRelationRepository bookShelfRelationRepo;
  @Autowired
  BookRepository bookRepository;
  @Autowired
  ShelvesRepository shelfRepository;
  public String addBookShelfRelation(BookShelfRelation bookShelfRelation) {
    if(bookRepository.existsById(bookShelfRelation.getBookId())){
   if(shelfRepository.existsById(bookShelfRelation.getShelfId())) {
     bookShelfRelationRepo.save(bookShelfRelation);
     return "Relation added";
   }
  }
   return "Invalid bookI or shelfId";
  }
}
