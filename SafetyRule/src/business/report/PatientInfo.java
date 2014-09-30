/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.report;

import java.util.Calendar;

/**
 *
 * @author skipper
 */
public class PatientInfo {
    private int mrn;
    private String name;
    private String gender;
    private String race;
    private Calendar dob;
    private String diagnosis;
    private String primaryPgysician;
    private HarmDegree harmDegree;
    
    public static final String MALE = "Male";
    public static final String FEMALE = "Female";
    
    public enum HarmDegree{
        NO("No"),
        MILD("Mild"),
        SEVERE("Severe"),
        NOTKNOW("Can't tell");
        
        private String degree;

        private HarmDegree(String degree){
            this.degree = degree;
        }
        
        public String getDegree() {
            return degree;
        }

        @Override
        public String toString() {
            return degree;
        }
    }

    public int getMrn() {
        return mrn;
    }

    public void setMrn(int mrn) {
        this.mrn = mrn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Calendar getDob() {
        return dob;
    }

    public void setDob(Calendar dob) {
        this.dob = dob;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPrimaryPgysician() {
        return primaryPgysician;
    }

    public void setPrimaryPgysician(String primaryPgysician) {
        this.primaryPgysician = primaryPgysician;
    }

    public HarmDegree getHarmDegree() {
        return harmDegree;
    }

    public void setHarmDegree(HarmDegree harmDegree) {
        this.harmDegree = harmDegree;
    }
    

    @Override
    public String toString() {
        return String.valueOf(mrn);
    }
    
    
}
