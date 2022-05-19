package com.pepcus.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

  /**
   * 
   */
  
  //why is this recommended
  private static final long serialVersionUID = -5443160400721864358L;

  public ResourceNotFoundException(String message) {
    super(message);
  }

}
