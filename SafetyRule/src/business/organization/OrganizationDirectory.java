/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import java.util.ArrayList;

/**
 *
 * @author skipper
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory(){
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    
    public Organization createOrganization(String type){
        Organization organization = null;
        switch (type) {
            case Organization.HOSREPORTER:
                organization = new HospitalReporter();
                organizationList.add(organization);
                break;
            case Organization.INDREPORTER:
                organization = new IndividualReporter();
                organizationList.add(organization);
                break;
            case Organization.PSOVALIDATION:
                organization = new PSOValidationTeam();
                organizationList.add(organization);
                break;
            case Organization.GOVANALYST:
                organization = new GovernmentAnalyst();
                organizationList.add(organization);
                break;
        }
        return organization;
    }
}
