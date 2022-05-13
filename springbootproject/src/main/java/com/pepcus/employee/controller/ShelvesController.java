package com.pepcus.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pepcus.employee.entities.Shelves;
import com.pepcus.employee.service.ShelvesService;

@RestController
@RequestMapping(value = "/shelves")
public class ShelvesController {
 

    @Autowired
    private ShelvesService shelvesService;
    
    @PostMapping("/")
    public Shelves saveShelf(@RequestBody Shelves shelf) { 
      
      return shelvesService.addShelf(shelf);
    } 
   
  
}
