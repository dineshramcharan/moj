package moj.gov.sa.patient.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Patient {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String dob;
    private String place;
    private String insurance;
    private String type;

    public Long getId() {  return id;  }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDob() { return dob;  }
    public void setDob(String dob) { this.dob = dob; }
    public String getPlace() {  return place; }
    public void setPlace(String place) {  this.place = place;  }
    public String getInsurance() {  return insurance;  }
    public void setInsurance(String insurance) { this.insurance = insurance; }
    public String getType() {   return type;  }
    public void setType(String type) {   this.type = type; }

}
