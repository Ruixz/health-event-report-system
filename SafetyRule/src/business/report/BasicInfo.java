/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.report;

import business.enterprise.Hospital;
import java.util.Calendar;
import java.util.HashSet;

/**
 *
 * @author skipper
 */
public class BasicInfo {
    
    private Calendar discoverDate;
    private Calendar reportDate;
    private String involved;
    private String place;
    private String description;
    private HashSet<String> eventCategories = new HashSet<>();
    private Hospital hospital;
    private String preventability;
    
    public static final String YES = "Yes";
    public static final String NO = "No";
    
    public static final String DEVICE = "Device";
    public static final String HUMAN = "Human Error";
    public static final String MEDICATION = "Medication";
    public static final String OTHER = "Other";
    
    public static final String ALMOST = "Almost";
    public static final String SOME = "To some extent";
    public static final String NOT = "Cannot";
    
    public BasicInfo(){
        
    }

    public Calendar getDiscoverDate() {
        return discoverDate;
    }

    public void setDiscoverDate(Calendar discoverDate) {
        this.discoverDate = discoverDate;
    }

    public Calendar getReportDate() {
        return reportDate;
    }

    public void setReportDate(Calendar reportDate) {
        this.reportDate = reportDate;
    }

    public String getInvolved() {
        return involved;
    }

    public void setInvolved(String involved) {
        this.involved = involved;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HashSet<String> getEventCategories() {
        return eventCategories;
    }

    public void setEventCategories(HashSet<String> eventCategories) {
        this.eventCategories = eventCategories;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public String getPreventability() {
        return preventability;
    }

    public void setPreventability(String preventability) {
        this.preventability = preventability;
    }

    
    
}
