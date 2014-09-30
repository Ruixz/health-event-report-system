/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.person.PersonDirectory;
import business.role.Role;
import business.userAccount.UserAccount;
import business.userAccount.UserAccountDirectory;
import business.workQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author skipper
 */
public abstract class Organization {
    private String name;
    private PersonDirectory personDirectory;
    private UserAccountDirectory userAccountDirectory;
    private WorkQueue workQueue;
    private String type;
    
    public static final String HOSREPORTER = "Hospital Reporter";
    public static final String INDREPORTER = "Individual Reporter";
    public static final String PSOVALIDATION = "PSO Validation Team";
    public static final String GOVANALYST = "Government Analyst";
    
    public Organization(){
        personDirectory = new PersonDirectory();
        userAccountDirectory = new UserAccountDirectory();
        workQueue = new WorkQueue();
    }
    
    public Organization(String name){
        this.name = name;
        personDirectory = new PersonDirectory();
        userAccountDirectory = new UserAccountDirectory();
        workQueue = new WorkQueue();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    

    @Override
    public String toString() {
        return name;
    }
    
    public UserAccount authenticateUser(String username, String password){
        return this.getUserAccountDirectory().authenticateUser(username, password);
    }
    
    public abstract ArrayList<Role> getSupportedRole();
}
