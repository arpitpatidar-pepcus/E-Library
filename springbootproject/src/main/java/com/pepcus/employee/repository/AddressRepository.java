package com.pepcus.employee.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pepcus.employee.entities.Address;
@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {


}
