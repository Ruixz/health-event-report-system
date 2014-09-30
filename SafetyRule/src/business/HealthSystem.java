/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.enterprise.Enterprise;
import business.enterprise.Government;
import business.network.Network;
import business.organization.Organization;
import business.report.Report;
import business.role.Role;
import business.role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author skipper
 */
public class HealthSystem extends Organization {
    private static HealthSystem system;
    private ArrayList<Network> networkList;
//    public static int reportNum = 1;
    
    public static HealthSystem getInstance(){
        if (system == null){
            system = new HealthSystem();
        }
        return system;
    }
    
    public HealthSystem(){
        networkList = new ArrayList<>();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        SystemAdminRole role = new SystemAdminRole();
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(role);
        return roleList;
    }
    
    public Network createAndAddNetwork(String name){
        for(Network country:this.getNetworkList()){
            if(country.getName().equalsIgnoreCase(name)){
                return null;
            }
        }
        Network network = new Network(name);
        network.setGov(new Government(network));
        networkList.add(network);
        return network;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkAllUnique(String userName){
        if(this.getUserAccountDirectory().checkUnique(userName)){
            for(Network country:networkList){
                if(country.getGov().getUserAccountDirectory().checkUnique(userName)){
                    for(Organization org:country.getGov().getOrganizationDirectory().getOrganizationList()){
                        if(!org.getUserAccountDirectory().checkUnique(userName)){
                            return false;
                        }
                    }
                }else{
                    return false;
                }
            }
        }else{
            return false;
        }
        
        for(Network country:networkList){
            for(Network state:country.getNetworkList()){
                for(Network city:state.getNetworkList()){
                    for(Enterprise e:city.getEnterpriseList()){
                        if(e.getUserAccountDirectory().checkUnique(userName)){
                            for(Organization organization:e.getOrganizationDirectory().getOrganizationList()){
                                if(!organization.getUserAccountDirectory().checkUnique(userName)){
                                    return false;
                                }
                            }
                        }else{
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    
    }
    
}
