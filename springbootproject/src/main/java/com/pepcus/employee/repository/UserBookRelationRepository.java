package com.pepcus.employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.pepcus.employee.entities.UserBookRelation;

public interface UserBookRelationRepository extends CrudRepository<UserBookRelation, Integer> {

}
