package com.pepcus.employee.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="UserBookRelation")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserBookRelation {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private int bookId;
  private int userId;
  private Date issuedOn;
  private Date returnedOn;
}
