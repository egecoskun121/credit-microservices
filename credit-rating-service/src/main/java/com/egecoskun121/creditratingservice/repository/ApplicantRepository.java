package com.egecoskun121.creditratingservice.repository;

import com.egecoskun121.creditratingservice.model.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantRepository extends JpaRepository<Applicant,Long> {

}
