/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arso
 */
public class Cart {
    private int cartId;
    private int productId;
    private int dateAddeed;
    private int quantity;

    public Cart(int cartId, int productId, int dateAddeed, int quantity) {
        this.cartId = cartId;
        this.productId = productId;
        this.dateAddeed = dateAddeed;
        this.quantity = quantity;
    }
    
    

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getDateAddeed() {
        return dateAddeed;
    }

    public void setDateAddeed(int dateAddeed) {
        this.dateAddeed = dateAddeed;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
