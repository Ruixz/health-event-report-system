/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.role.PSOValidationRole;
import business.role.Role;
import business.workQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author skipper
 */
public class PSOValidationTeam extends Organization{
    private WorkQueue receiveReport;
    private WorkQueue sendReport;
    
    public PSOValidationTeam(){
        receiveReport = new WorkQueue();
        sendReport = new WorkQueue();
    }

    public WorkQueue getReceiveReport() {
        return receiveReport;
    }

    public void setReceiveReport(WorkQueue receiveReport) {
        this.receiveReport = receiveReport;
    }

    public WorkQueue getSendReport() {
        return sendReport;
    }

    public void setSendReport(WorkQueue sendReport) {
        this.sendReport = sendReport;
    }
    
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PSOValidationRole());
        return roles;
    }
    
}
