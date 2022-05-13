package com.pepcus.employee.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="LibraryUser")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

  @Id
  private int id;
  private String name;
  private int issuedBookId;
  
  private Date registeredDate;
  private Date deactivationDate;
  private String deregister;
}
