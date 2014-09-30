/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.anlysis;

/**
 *
 * @author skipper
 */
public class Entry {
    private String title;
    private int quantity;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void addQuantity(){
        this.quantity +=1;
    }
    
    @Override
    public int hashCode() {
        return title.hashCode();
    }
    
    @Override
    public boolean equals(Object aEntry) {
        Entry e = (Entry) aEntry;
        return this.getTitle().equals(e.getTitle());
    }
    
    
}
