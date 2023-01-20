package com.burakkolay.creditratingservice.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Transient;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "applicant")
public class Applicant implements Serializable {

    @Transient
    private Long id;

    @Id
    private Long identificationNumber;
    @Transient
    private String firstName;
    @Transient
    private String lastName;
    @Transient
    private double monthlyIncome;
    @Transient
    private String phoneNumber;

    private int creditRating;

    @Transient
    @JsonManagedReference
    @OneToMany
    private List<Credit> credit;


}