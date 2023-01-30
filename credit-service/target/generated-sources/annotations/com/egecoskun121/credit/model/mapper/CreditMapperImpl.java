package com.egecoskun121.credit.model.mapper;

import com.egecoskun121.credit.model.DTO.CreditDTO;
import com.egecoskun121.credit.model.entity.Credit;
import com.egecoskun121.credit.model.entity.CreditResult;
import javax.annotation.processing.Generated;

import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-26T09:08:59+0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class CreditMapperImpl implements CreditMapper {

    @Override
    public CreditDTO toCreditDTO(Credit credit) {
        if ( credit == null ) {
            return null;
        }

        CreditDTO creditDTO = new CreditDTO();

        if ( credit.getCreditResult() != null ) {
            creditDTO.setCreditResult( credit.getCreditResult().name() );
        }
        creditDTO.setCreditBalance( (int) credit.getCreditBalance() );

        return creditDTO;
    }

    @Override
    public Credit toCredit(CreditDTO creditDTO) {
        if ( creditDTO == null ) {
            return null;
        }

        Credit credit = new Credit();

        credit.setCreditBalance( creditDTO.getCreditBalance() );
        if ( creditDTO.getCreditResult() != null ) {
            credit.setCreditResult( Enum.valueOf( CreditResult.class, creditDTO.getCreditResult() ) );
        }

        return credit;
    }
}
