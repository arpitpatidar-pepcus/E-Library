package com.pepcus.employee.entities;

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
@Table(name = "BookShelfRelation")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookShelfRelation {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private int bookId;
  private int shelfId;
}
