/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.organization.IndividualReporter;
import business.role.AdminRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author skipper
 */
public class Individual extends Enterprise{
    public Individual(){
//        this.getOrganizationDirectory().getOrganizationList().add(new IndividualReporter());
    }
    
    public Individual(String name){
        super(name,EnterpriseType.INDIVIDUAL);
//        this.getOrganizationDirectory().getOrganizationList().add(new IndividualReporter());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminRole());
        return roles;
    }
    
}
