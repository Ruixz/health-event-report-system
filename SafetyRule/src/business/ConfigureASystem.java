/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.network.Network;
import business.person.Person;
import business.role.SystemAdminRole;
import business.userAccount.UserAccount;

/**
 *
 * @author skipper
 */
public class ConfigureASystem {
    public static HealthSystem configure(){
        
        HealthSystem system = HealthSystem.getInstance();
        
        Person architect = new Person("Rui Song");
        architect.setEmail("song.ru@husk.neu.edu");
        architect.setPhone("6179521503");
        architect.setPosition("Architect");
        
        UserAccount userAccount = new UserAccount();
        userAccount.setPerson(architect);
        userAccount.setUsername("sysadmin");
        userAccount.setPassword("sysadmin");
        userAccount.setRole(new SystemAdminRole());
        system.getUserAccountDirectory().getUserAccountList().add(userAccount);
        
        Network usa = system.createAndAddNetwork("USA");
        Network ma = usa.createNetwork("MA");
        Network boston = ma.createNetwork("Boston");
        
        return system;
    }
}
