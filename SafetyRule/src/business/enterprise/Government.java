/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.network.Network;
import business.organization.GovernmentAnalyst;
import business.organization.Organization;
import business.organization.OrganizationDirectory;
import business.role.AdminRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author skipper
 */
public class Government extends Enterprise {
//    private OrganizationDirectory organizationDirectory;
    
    public Government(){
//        organizationDirectory = new OrganizationDirectory();
//        organizationDirectory.getOrganizationList().add(new GovernmentAnalyst());
    }
    
    public Government(Network country){
        this.setName(country.getName());
//        organizationDirectory = new OrganizationDirectory();
//        organizationDirectory.getOrganizationList().add(new GovernmentAnalyst());
    }

//    public OrganizationDirectory getOrganizationDirectory() {
//        return organizationDirectory;
//    }
//
//    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
//        this.organizationDirectory = organizationDirectory;
//    }

    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AdminRole());
        return roles;
    }
}
