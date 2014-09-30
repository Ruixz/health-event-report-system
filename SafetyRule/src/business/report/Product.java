/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.report;

/**
 *
 * @author skipper
 */
public class Product {
    private String productName;
    private ProductType productType;
    
    public Product(){
        
    }
    
    public Product(String name,ProductType type){
        this.productName = name;
        this.productType = type;
    }
    
    public enum ProductType{
        BLOOD("Blood"),
        MEDCINE("Medicine"),
        FACILITY("Facility"),
        EQUIPMENT("Equipment");
        
        private String type;
        
        private ProductType(String type){
            this.type = type;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return type;
        }
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductType getProductType() {
        return productType;
    }

    @Override
    public String toString() {
        return productName;
    }
    
}
