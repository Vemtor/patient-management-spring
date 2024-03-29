package com.orlowski.patientmanagement.dao;

import com.orlowski.patientmanagement.entity.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    @Query("SELECT p FROM Patient p WHERE p.lastName LIKE %?1%" +
            "OR p.firstName LIKE %?1%" +
            "OR p.phoneNumber LIKE %?1% " +
            "OR p.pesel LIKE %?1% " +
            "OR p.street LIKE %?1%" +
            "OR p.city LIKE %?1%" +
            "OR p.zipCode LIKE %?1%")
    Page<Patient> findByAnythingContaining(String name, Pageable pageable);
}
