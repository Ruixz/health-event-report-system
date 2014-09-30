/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.userAccount;

import business.person.Person;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author skipper
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory(){
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }
    
    public UserAccount createUserAccount(String username,String password,Person person,Role role){
        UserAccount ua = new UserAccount();
        ua.setUsername(username);
        ua.setPassword(password);
        ua.setPerson(person);
        ua.setRole(role);
        userAccountList.add(ua);
        return ua;
    }
    
    public UserAccount authenticateUser(String username,String password){
        for(UserAccount ua: userAccountList){
            if(ua.getUsername().equals(username)&&ua.getPassword().equals(password)){
                return ua;
            }
        }
        return null;
    }
    
    public boolean checkUnique(String userName){
        for(UserAccount ua:userAccountList){
            if(ua.getUsername().equals(userName)){
                return false;
            }
        }
        return true;
    }
    
    public void deleteUserAccount(UserAccount ua){
        userAccountList.remove(ua);
    }
    
}
