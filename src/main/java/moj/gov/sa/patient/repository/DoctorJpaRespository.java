package moj.gov.sa.patient.repository;

import moj.gov.sa.patient.model.Doctor;
import moj.gov.sa.patient.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface DoctorJpaRespository extends JpaRepository<Doctor,Long> {
    Doctor findByName(String name);
    Optional<Doctor> findById(Long id);
}
