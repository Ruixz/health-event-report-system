/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.report;

import java.util.ArrayList;

/**
 *
 * @author skipper
 */
public class ProductInfo {
    private ArrayList<Product> productList;
    
    public ProductInfo(){
        productList = new ArrayList<>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    public Product createProduct(String name, Product.ProductType type){
        Product p = new Product(name, type);
        productList.add(p);
        return p;
    }
}
