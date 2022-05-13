package com.pepcus.employee.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="BookDetails")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Books {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String name;
  @JsonFormat(pattern="dd-mm-yyyy")
  private Date addedOn;
  private Date modifiedOn;

  
  
  
}
