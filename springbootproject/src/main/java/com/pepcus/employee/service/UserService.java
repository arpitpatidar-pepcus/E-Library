package com.pepcus.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pepcus.employee.entities.User;
import com.pepcus.employee.repository.UserRepository;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public User addUser(User user) {
    if(user.getDeregister().equalsIgnoreCase("Yes")) {
//      userRepository.deregisterUser(user.getId());
      userRepository.deleteById(user.getId());
      return user;
    }
   
    return userRepository.save(user);
  }
  
}
