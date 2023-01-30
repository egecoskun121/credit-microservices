package com.egecoskun121.credit.model.mapper;

import com.egecoskun121.credit.model.DTO.ApplicantDTO;
import com.egecoskun121.credit.model.entity.Applicant;
import org.mapstruct.Mapper;

@Mapper
public interface ApplicantMapper {
    ApplicantDTO toApplicantDTO(Applicant applicant);
    Applicant toApplicant(ApplicantDTO applicantDTO);
}
