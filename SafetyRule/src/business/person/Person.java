/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.person;

import javax.swing.JOptionPane;

/**
 *
 * @author skipper
 */
public class Person {
    private String name;
    private String phone;
    private String email;
    private String position;
    
    public static final String DOCTOR = "Doctor";
    public static final String NURSE = "Nurse";
    public static final String HOSPITALSTAFF = "Hospital Staff";
    public static final String PATIENT = "Patient";
    public static final String VALIDATION = "Validation Team";
    public static final String GOVANALYST = "Government Analyst";
    public static final String GOVERNMENTADMIN = "Government Admin";
    
    public Person(){
        
    }
    
    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    
}
