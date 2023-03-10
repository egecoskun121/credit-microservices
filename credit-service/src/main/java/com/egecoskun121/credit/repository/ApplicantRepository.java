package com.egecoskun121.credit.repository;

import com.egecoskun121.credit.model.entity.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ApplicantRepository extends JpaRepository<Applicant,Long> {


    @Query(value = "SELECT * FROM applicant WHERE applicant.identification_number=:identificationNumber",nativeQuery = true)
    Applicant getApplicantByIdentificationNumber(@Param("identificationNumber") Long identificationNumber);


    @Query(value = "SELECT * FROM applicant WHERE id= (SELECT applicant_id FROM credit WHERE id= (:creditId))",nativeQuery = true)
    Applicant getApplicantFromCreditId(@Param("creditId")Long creditId);

    boolean existsApplicantByIdentificationNumber(Long identificationNumber);

    boolean existsApplicantByPhoneNumber(String phoneNumber);
}
