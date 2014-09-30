/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.userAccount;

import business.HealthSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.person.Person;
import business.role.Role;
import business.workQueue.WorkQueue;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author skipper
 */
public class UserAccount {
    private String username;
    private String password;
    private Person person;
    private Role role;
//    private WorkQueue workQueue;
    
    public UserAccount(){
//        workQueue = new WorkQueue();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

//    public WorkQueue getWorkQueue() {
//        return workQueue;
//    }

    @Override
    public String toString() {
        return username;
    }
    
    public ArrayList<String> findBelonged(HealthSystem system,UserAccount userAccount){
        ArrayList<String> stringList = new ArrayList<>();
        Network belongedCountry = null;
        Network belongedState = null;
        Network belongedCity = null;
        Enterprise belongedEnterprise = null;
        Organization belongOrganization = null;
        for(Network country: system.getNetworkList()){
            for(Network state: country.getNetworkList()){
                for(Network city: state.getNetworkList()){
                    for(Enterprise e:city.getEnterpriseList()){
                        for(Organization org:e.getOrganizationDirectory().getOrganizationList()){
                            for(UserAccount ua: org.getUserAccountDirectory().getUserAccountList()){
                                if(ua == userAccount){
                                    belongedCountry = country;
                                    belongedState = state;
                                    belongedCity = city;
                                    belongedEnterprise = e;
                                    belongOrganization = org;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if(belongedCountry!=null&&belongedState!=null&&belongedCity!=null&&belongedEnterprise!=null
                &&belongOrganization!=null){
            stringList.add(belongedCountry.getName());
            stringList.add(belongedState.getName());
            stringList.add(belongedCity.getName());
            stringList.add(belongedEnterprise.getName());
            stringList.add(belongOrganization.getName());
        }else{
            JOptionPane.showMessageDialog(null, "Not find");
        }
        
        return stringList;
    } 
}
