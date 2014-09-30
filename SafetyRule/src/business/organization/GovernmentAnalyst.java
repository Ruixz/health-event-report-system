/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.anlysis.KnowledgeBase;
import business.enterprise.Government;
import business.role.GovernmentAnalystRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author skipper
 */
public class GovernmentAnalyst extends Organization{
    private Government gov;
    private KnowledgeBase kb;
    
    public GovernmentAnalyst(){
        kb = new KnowledgeBase();
    }

    public Government getGov() {
        return gov;
    }

    public void setGov(Government gov) {
        this.gov = gov;
    }

    public KnowledgeBase getKb() {
        return kb;
    }

    public void setKb(KnowledgeBase kb) {
        this.kb = kb;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new GovernmentAnalystRole());
        return roles;
    }
    
    
    
}
