package com.pepcus.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pepcus.employee.entities.Shelves;
import com.pepcus.employee.repository.ShelvesRepository;

@Service
public class ShelvesService {

  @Autowired
  ShelvesRepository shelvesRepository;

  public Shelves addShelf(Shelves shelf) {
    
    return shelvesRepository.save(shelf);
  }
  
}
