package moj.gov.sa.patient.repository;

import moj.gov.sa.patient.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface PatientJpaRespository extends JpaRepository<Patient,Long> {
    Patient findByName(String name);
    Optional<Patient> findById(Long id);
}
