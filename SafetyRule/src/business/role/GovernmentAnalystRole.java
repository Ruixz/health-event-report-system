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
import userInterface.government.GovernmentAnalystWorkAreaJPanel;

/**
 *
 * @author skipper
 */
public class GovernmentAnalystRole extends Role{
    public GovernmentAnalystRole(){
        this.setType(RoleType.GovermentAnalyst);
    }
    
    @Override
    public JPanel createWorkArea(JPanel container, UserAccount userAccount,Organization organization, Enterprise enterprise, HealthSystem system) {
        return new GovernmentAnalystWorkAreaJPanel(container,userAccount,organization,enterprise,system);
    }
    
}
