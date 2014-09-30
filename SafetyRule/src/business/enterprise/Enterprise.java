/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.HealthSystem;
import business.network.Network;
import business.organization.Organization;
import business.organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author skipper
 */
public abstract class Enterprise extends Organization {
    private OrganizationDirectory organizationDirectory;
    private EnterpriseType enterpriseType;
    
    public enum EnterpriseType{
        HOSPITAL("Hospital"),
        INDIVIDUAL("Individual"),
        PSO("PSO");
        
        private String type;

        private EnterpriseType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
        
        @Override
        public String toString(){
            return type;
        }
    }
    
    public Enterprise(){
        organizationDirectory = new OrganizationDirectory();
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public ArrayList<Network> findNetwork(HealthSystem system,Enterprise enterprise){
        ArrayList<Network> networkList = new ArrayList<>();
        Network belongedCountry = null;
        Network belongedState = null;
        Network belongedCity = null;
        for(Network country: system.getNetworkList()){
            for(Network state: country.getNetworkList()){
                for(Network city: state.getNetworkList()){
                    for(Enterprise e:city.getEnterpriseList()){
                        if(e==enterprise){
                            belongedCountry = country;
                            belongedState = state;
                            belongedCity = city;
                            break;
                        }
                    }
                }
            }
        }
        networkList.add(belongedCountry);
        networkList.add(belongedState);
        networkList.add(belongedCity);
        return networkList;
    }
}
