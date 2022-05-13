package com.pepcus.employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.pepcus.employee.entities.Books;

public interface BookRepository extends CrudRepository<Books, Integer>  {

}
