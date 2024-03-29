package com.orlowski.patientmanagement.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name="patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")

    private Long id;


    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<Test> patientTests;

    @Column(name="first_name")
    @NotBlank(message = "first name is mandatory")
    private String firstName;

    @Column(name="last_name")
    @NotBlank(message = "last name is mandatory")
    private String lastName;


    @Column(name="pesel")
    @NotBlank(message = "pesel is mandatory")
    @Pattern(regexp = "\\d{11}", message = "pesel must be 11 digits long")
    private String pesel;

    @Column(name="street")
    @NotBlank(message = "street is mandatory")
    private String street;

    @Column(name="city")
    @NotBlank(message = "city is mandatory")
    private String city;

    @NotBlank(message = "zipCode is mandatory")
    @Pattern(regexp = "\\d{2}-\\d{3}", message = "Zip code must be in the format xx-xxx")
    @Column(name="zipCode")
    private String zipCode;

    @Column(name="phoneNumber")
    @NotBlank(message = "phone number is mandatory")
    @Pattern(regexp = "\\+\\d+", message = "Phone number must start with '+'")
    private String phoneNumber;

    @Column(name="short_description")
    private String shortDescription;

}

