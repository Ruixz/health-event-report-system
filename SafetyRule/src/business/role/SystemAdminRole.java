/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.HealthSystem;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.systemAdmin.SystemAdminWorkAreaJPanel;

/**
 *
 * @author skipper
 */
public class SystemAdminRole extends Role{
    public SystemAdminRole(){
        this.setType(RoleType.SystemAdminRole);
    }

    @Override
    public JPanel createWorkArea(JPanel container, UserAccount userAccount,Organization organization, Enterprise enterprise, HealthSystem system) {
        return new SystemAdminWorkAreaJPanel(container,system);
    }
    
}
