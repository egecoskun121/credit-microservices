package com.egecoskun121.creditratingservice.repository;

import com.egecoskun121.creditratingservice.model.Credit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditRepository extends JpaRepository<Credit,Long> {
}
