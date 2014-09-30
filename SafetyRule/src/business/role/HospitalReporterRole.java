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
import userInterface.hospital.HospitalReporterWorkAreaJPanel;

/**
 *
 * @author skipper
 */
public class HospitalReporterRole extends Role{
    public HospitalReporterRole(){
        this.setType(RoleType.HospitalReporter);
    }
    
    @Override
    public JPanel createWorkArea(JPanel container, UserAccount userAccount,Organization organization, Enterprise enterprise, HealthSystem system) {
        return new HospitalReporterWorkAreaJPanel(container, userAccount,organization,enterprise,system);
    }
    
}
