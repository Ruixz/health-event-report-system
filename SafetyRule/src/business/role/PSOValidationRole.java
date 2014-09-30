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
import userInterface.pso.PSOValidationWorkAreaJPanel;

/**
 *
 * @author skipper
 */
public class PSOValidationRole extends Role{
    public PSOValidationRole(){
        this.setType(RoleType.PSOValidation);
    }

    @Override
    public JPanel createWorkArea(JPanel container, UserAccount userAccount,Organization organization, Enterprise enterprise, HealthSystem system) {
        return new PSOValidationWorkAreaJPanel(container,userAccount,organization,enterprise,system);
    }
    
}
