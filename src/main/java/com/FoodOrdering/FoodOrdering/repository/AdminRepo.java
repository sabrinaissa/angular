package com.FoodOrdering.FoodOrdering.repository;

import com.FoodOrdering.FoodOrdering.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<Admin,Integer> {
}
