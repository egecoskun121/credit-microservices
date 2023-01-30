package com.egecoskun121.credit.model.mapper;

import com.egecoskun121.credit.model.DTO.CreditDTO;
import com.egecoskun121.credit.model.entity.Credit;
import org.mapstruct.Mapper;

@Mapper
public interface CreditMapper {
    CreditDTO toCreditDTO(Credit credit);
    Credit toCredit(CreditDTO creditDTO);
}
