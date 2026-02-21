package com.kabir.expenseTracker.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "expense")
public class Expense {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
  
  private Integer amount;
  private String description;
  private LocalDateTime date;

  @ManyToOne
  @JoinColumn(name= "category_id", nullable= false)
  private Category category;
  
  public Expense (){}
  public Long getId(){return id;}

  public Integer setAmount(Integer amount) { 
    this.amount = amount;
    return null;
  }

  public Integer getTotalAmount () {
    return amount;
  }

  public String getDescription () {
    return description;
  }

  public String setDescription (String desc) {
    this.description = desc;
    return null;
  }
  
  public LocalDateTime getDate () {
    return date;
  }

  public LocalDateTime setDate (LocalDateTime date) {
    this.date = date;
    return null;
  }

  public Category getCategory () {
    return category;
  }

  public String setCategory (Category cate) {
    this.category = cate;
    return null;
  }

}