package com.kabir.expenseTracker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="income")
public class Income {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  private Integer income;

  public Income () {}
  public Long getId () { return id;}

  public Integer getIncome () { return income; }
  public Integer setIncome (Integer income) { 
    this.income = income;
    return null;
  }

}