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
import userInterface.individual.IndividualReporterWorkAreaJPanel;

/**
 *
 * @author skipper
 */
public class IndividualReporterRole extends Role {
    public IndividualReporterRole(){
        this.setType(RoleType.IndividualReporter);
    }
    
    @Override
    public JPanel createWorkArea(JPanel container, UserAccount userAccount,Organization organization, Enterprise enterprise, HealthSystem system) {
        return new IndividualReporterWorkAreaJPanel(container, userAccount,organization,enterprise,system);
    }
    
}
