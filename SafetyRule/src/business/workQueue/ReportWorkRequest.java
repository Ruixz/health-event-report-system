/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workQueue;

import business.organization.Organization;
import business.report.Report;

/**
 *
 * @author skipper
 */
public class ReportWorkRequest extends WorkRequest{
    private Report report;
    private Organization receiverOrg;

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }

    public Organization getReceiverOrg() {
        return receiverOrg;
    }

    public void setReceiverOrg(Organization receiverOrg) {
        this.receiverOrg = receiverOrg;
    }
    
    
}
