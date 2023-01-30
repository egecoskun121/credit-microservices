package com.egecoskun121.credit.model.mapper;

import com.egecoskun121.credit.model.DTO.ApplicantDTO;
import com.egecoskun121.credit.model.entity.Applicant;
import javax.annotation.processing.Generated;

import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-26T09:08:59+0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class ApplicantMapperImpl implements ApplicantMapper {

    @Override
    public ApplicantDTO toApplicantDTO(Applicant applicant) {
        if ( applicant == null ) {
            return null;
        }

        ApplicantDTO applicantDTO = new ApplicantDTO();

        applicantDTO.setIdentificationNumber( applicant.getIdentificationNumber() );
        applicantDTO.setFirstName( applicant.getFirstName() );
        applicantDTO.setLastName( applicant.getLastName() );
        applicantDTO.setMonthlyIncome( applicant.getMonthlyIncome() );
        applicantDTO.setPhoneNumber( applicant.getPhoneNumber() );
        applicantDTO.setDateOfBirth( applicant.getDateOfBirth() );

        return applicantDTO;
    }

    @Override
    public Applicant toApplicant(ApplicantDTO applicantDTO) {
        if ( applicantDTO == null ) {
            return null;
        }

        Applicant applicant = new Applicant();

        applicant.setIdentificationNumber( applicantDTO.getIdentificationNumber() );
        applicant.setFirstName( applicantDTO.getFirstName() );
        applicant.setLastName( applicantDTO.getLastName() );
        applicant.setMonthlyIncome( applicantDTO.getMonthlyIncome() );
        applicant.setPhoneNumber( applicantDTO.getPhoneNumber() );
        applicant.setDateOfBirth( applicantDTO.getDateOfBirth() );

        return applicant;
    }
}
