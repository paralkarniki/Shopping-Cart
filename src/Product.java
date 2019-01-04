/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arso
 */
public class Product {
    private int productId;
    private String name;
    private String desc;
    private double price;

    public Product(int productId, String name, String desc, double price) {
        this.productId = productId;
        this.name = name;
        this.desc = desc;
        this.price = price;
    }
    
    public String getProductDetails(){
        return desc;
    }
}
