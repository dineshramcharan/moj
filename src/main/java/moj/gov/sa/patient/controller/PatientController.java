package moj.gov.sa.patient.controller;

import moj.gov.sa.patient.model.Patient;
import moj.gov.sa.patient.repository.PatientJpaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/patients")
public class PatientController {

    @Autowired
    private PatientJpaRespository patientJpaRespository;

    @GetMapping(value="/list")
    public List<Patient> findAll(){
        return patientJpaRespository.findAll();
    }

    @GetMapping(value="/findName/{name}")
    public Patient findByName(@PathVariable final String name){
        return patientJpaRespository.findByName(name);
    }

    @GetMapping(value="/findId/{id}")
    public Patient findById(@PathVariable final Long id){
        return (Patient) patientJpaRespository.findOne(id);
    }

    @GetMapping(value="/isRegistered/{id}")
    public Boolean isRegistered(@PathVariable final Long id){
        return  patientJpaRespository.exists(id);
    }

    @PostMapping(value="/add")
    public Patient load(@RequestBody  final Patient patient){
        patientJpaRespository.save(patient);
        return patientJpaRespository.findByName(patient.getName());
    }
}
