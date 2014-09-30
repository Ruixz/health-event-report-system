/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.network;

import business.enterprise.Enterprise;
import business.enterprise.Government;
import business.enterprise.Hospital;
import business.enterprise.Individual;
import business.enterprise.PSO;
import java.util.ArrayList;

/**
 *
 * @author skipper
 */
public class Network {
    private String name;
    private ArrayList<Network> networkList;
    private ArrayList<Enterprise> enterpriseList;
    private Government gov;
    
    public Network(){
        networkList = new ArrayList<>();
        enterpriseList = new ArrayList<>();
    }
    
    public Network(String name){
        this.name = name;
        networkList = new ArrayList<>();
        enterpriseList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public Government getGov() {
        return gov;
    }

    public void setGov(Government gov) {
        this.gov = gov;
    }

    @Override
    public String toString() {
        return name ;
    }
    
   public Network createNetwork(String name){
       for(Network net:this.getNetworkList()){
           if(net.getName().equalsIgnoreCase(name)){
               return null;
           }
       }
       Network network = new Network(name);
       networkList.add(network);
       return network;
   }
   
   public Enterprise createEnterprise(String name, Enterprise.EnterpriseType type){
       Enterprise enterprise = null;
       if(type==Enterprise.EnterpriseType.HOSPITAL){
           enterprise = new Hospital(name);
       }else if(type == Enterprise.EnterpriseType.INDIVIDUAL){
           enterprise = new Individual(name);
       }else if(type ==Enterprise.EnterpriseType.PSO){
           enterprise = new PSO(name);
       }
       this.getEnterpriseList().add(enterprise);
       return enterprise;
   }
}
