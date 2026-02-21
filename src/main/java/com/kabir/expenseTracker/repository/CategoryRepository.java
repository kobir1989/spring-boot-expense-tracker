package com.kabir.expenseTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kabir.expenseTracker.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}