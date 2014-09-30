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

/**
 *
 * @author skipper
 */
public abstract class Role {
    private RoleType type;
    
    public enum RoleType{
        SystemAdminRole("System Admin"),
        AdminRole("Enterprise Admin"),
        GovAdminRole("Goverment Admin"),
        GovermentAnalyst("Goverment Analyst"),
        HospitalReporter("Hospital Reporter"),
        IndividualReporter("Individual Reporter"),
        PSOValidation("PSO Validation Team");
        
        private String value;
        
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public RoleType getType() {
        return type;
    }

    public void setType(RoleType type) {
        this.type = type;
    }
    
    public abstract JPanel createWorkArea(JPanel container, UserAccount userAccount,Organization organization, Enterprise enterprise, HealthSystem system);
    
    @Override
    public String toString() {
        return type.getValue();
    }
}
