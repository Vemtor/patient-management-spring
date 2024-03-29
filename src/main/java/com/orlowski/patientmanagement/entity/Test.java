package com.orlowski.patientmanagement.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name="medicaltest")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="test_id")
    private Long test_id;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name="patient_id")
    @NotBlank(message = "patient_id is mandatory")
    private Patient patient;

    @Column(name="doctor")
    @NotBlank(message = "doctor name is mandatory")
    private String doctor;

    @Column(name="title")
    @NotBlank(message = "title of test is mandatory")
    private String title;

    @Column(name="date")
    @NotBlank(message = "date is mandatory")
    private Date date;

}
