/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.organization.PSOValidationTeam;
import business.role.AdminRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author skipper
 */
public class PSO extends Enterprise {
    
            
    public PSO(){
//        this.getOrganizationDirectory().getOrganizationList().add(new PSOValidationTeam());
    }
    
    public PSO(String name){
        super(name,EnterpriseType.PSO);
//        this.getOrganizationDirectory().getOrganizationList().add(new PSOValidationTeam());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminRole());
        return roles;
    }
    
    
}
