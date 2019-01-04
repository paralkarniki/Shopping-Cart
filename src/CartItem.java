/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arso
 */
public class CartItem {
    private String name;
    private int quantity;
    private int productId;
    private double unitCost;

    public CartItem(String name, int quantity, int productId, double unitCost) {
        this.name = name;
        this.quantity = quantity;
        this.productId = productId;
        this.unitCost = unitCost;
    }
    
    
    
    public double CalcPrice(){
        double total = 0;
        total += unitCost * (double)quantity;
        return total;
    }
    
}
