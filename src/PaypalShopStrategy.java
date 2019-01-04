/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikita
 */
public class PaypalShopStrategy extends PaymentTypeStrategy{
   

	private String custemailId;
	private String userpassword;
	
	public PaypalShopStrategy(String email, String pwd){
		this.custemailId=email;
		this.userpassword=pwd;
	}
	
	public void pay(int amount) {
		System.out.println(amount + " paid using Paypal.");
	}

}
