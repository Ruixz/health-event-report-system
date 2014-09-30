/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.report;

import business.HealthSystem;

/**
 *
 * @author skipper
 */
public class Report {
    private int eventID;
    private BasicInfo basic;
    private PatientInfo patient;
    private ProductInfo product;
    
    private static int count = 1;
    
    public Report(){
        eventID = count++;
        
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }
    
    public BasicInfo getBasic() {
        return basic;
    }

    public void setBasic(BasicInfo basic) {
        this.basic = basic;
    }

    public PatientInfo getPatient() {
        return patient;
    }

    public void setPatient(PatientInfo patient) {
        this.patient = patient;
    }

    public ProductInfo getProduct() {
        return product;
    }

    public void setProduct(ProductInfo product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return String.valueOf(eventID);
    }
    
}
