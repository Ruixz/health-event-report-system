/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.organization.HospitalReporter;
import business.role.AdminRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author skipper
 */
public class Hospital extends Enterprise {
    public Hospital(){
//        this.getOrganizationDirectory().getOrganizationList().add(new HospitalReporter());
    }
    
    public Hospital(String name){
        super(name, EnterpriseType.HOSPITAL);
//        this.getOrganizationDirectory().getOrganizationList().add(new HospitalReporter());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminRole());
        return roles;
    }
    
    
}
