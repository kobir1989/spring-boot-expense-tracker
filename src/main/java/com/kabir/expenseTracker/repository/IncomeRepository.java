package com.kabir.expenseTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kabir.expenseTracker.entity.Income;

public interface IncomeRepository extends JpaRepository<Income, Long> {

  @Query("SELECT SUM(i.income) FROM Income i")
  Integer getTotalIncome();
}