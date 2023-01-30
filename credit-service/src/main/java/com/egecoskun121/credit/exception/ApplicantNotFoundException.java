package com.egecoskun121.credit.exception;

public class ApplicantNotFoundException extends RuntimeException{

    public ApplicantNotFoundException(String applicant,Long id){
        super("Related "+applicant+" not found with id:"+id);
    }
}
