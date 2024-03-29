package com.orlowski.patientmanagement.dao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.orlowski.patientmanagement.entity.Patient;
import com.orlowski.patientmanagement.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TestRepository extends JpaRepository<Test, Long> {
    @Query("SELECT t FROM Test t WHERE t.patient.id = ?1")
    Page<Test> findTestByPatientId(String id, Pageable pageable);

}
