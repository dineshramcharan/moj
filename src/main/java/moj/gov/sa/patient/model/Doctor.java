package moj.gov.sa.patient.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Doctor {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String specialization;
    private String exp;
    private String dept;


    public Long getId() {  return id;   }
    public void setId(Long id) { this.id = id;  }
    public String getName() {  return name; }
    public void setName(String name) {  this.name = name;  }
    public String getSpecialization() {  return specialization;  }
    public void setSpecialization(String specialization) {  this.specialization = specialization; }
    public String getExp() {  return exp;  }
    public void setExp(String exp) {  this.exp = exp; }
    public String getDept() { return dept;  }
    public void setDept(String dept) {   this.dept = dept;  }



}
