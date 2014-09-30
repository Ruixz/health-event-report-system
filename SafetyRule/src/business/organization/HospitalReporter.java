/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.HospitalReporterRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author skipper
 */
public class HospitalReporter extends Organization{

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HospitalReporterRole());
        return roles;
    }
    
}
