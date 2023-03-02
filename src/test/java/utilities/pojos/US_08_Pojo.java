package utilities.pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US_08_Pojo {

    private int id;
    private US_08_PatientPojo patientPojo;

    public US_08_Pojo(int id, US_08_PatientPojo patientPojo) {
        this.id = id;
        this.patientPojo = patientPojo;
    }

    public US_08_Pojo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public US_08_PatientPojo getPatientPojo() {
        return patientPojo;
    }

    public void setPatientPojo(US_08_PatientPojo patientPojo) {
        this.patientPojo = patientPojo;
    }

    @Override
    public String toString() {
        return "US_08_Pojo{" +
                "id=" + id +
                ", patientPojo=" + patientPojo +
                '}';
    }
}


