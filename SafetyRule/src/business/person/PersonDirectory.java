/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.person;

import java.util.ArrayList;

/**
 *
 * @author skipper
 */
public class PersonDirectory {
    private ArrayList<Person> personList;
    
    public PersonDirectory(){
        personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public Person createPerson(){
        Person person = new Person();
        personList.add(person);
        return person;
    }
    
    public Person createPerson(String name){
        Person person = createPerson();
        person.setName(name);
        return person;
    }
}
