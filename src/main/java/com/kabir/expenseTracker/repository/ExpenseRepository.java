package com.kabir.expenseTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kabir.expenseTracker.entity.Expense;
import com.kabir.expenseTracker.entity.Category;

import java.util.List;


public interface ExpenseRepository extends JpaRepository<Expense, Long> {

   // Sum of all expensess
  @Query("SELECT SUM(e.amount) FROM Expense e")
  Integer getTotalExpense();

  // Total expense for a specific category
  @Query("SELECT SUM(e.amount) FROM Expense e WHERE e.category.id = :categoryId")
  Integer getTotalExpenseByCategoryId(Long categoryId);
}