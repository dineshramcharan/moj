package moj.gov.sa.patient.controller;

import moj.gov.sa.patient.model.Doctor;
import moj.gov.sa.patient.model.Patient;
import moj.gov.sa.patient.repository.DoctorJpaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    @Autowired
    private DoctorJpaRespository doctorJpaRespository;

    @GetMapping(value="/list")
    public List<Doctor> findAll(){
        return doctorJpaRespository.findAll();
    }

    @GetMapping(value="/findName/{name}")
    public Doctor findByName(@PathVariable final String name){
        return doctorJpaRespository.findByName(name);
    }

    @GetMapping(value="/findId/{id}")
    public Doctor findById(@PathVariable final Long id){
        return (Doctor) doctorJpaRespository.findOne(id);
    }

    @GetMapping(value="/isRegistered/{id}")
    public Boolean isRegistered(@PathVariable final Long id){
        return  doctorJpaRespository.exists(id);
    }

    @PostMapping(value="/add")
    public Doctor load(@RequestBody  final Doctor doctor){
        doctorJpaRespository.save(doctor);
        return doctorJpaRespository.findByName(doctor.getName());
    }
}
