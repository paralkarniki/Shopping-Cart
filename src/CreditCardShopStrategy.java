/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikita
 */
public class CreditCardShopStrategy  extends PaymentTypeStrategy{
    
	private String custname;
	private String custcardNumber;
	private String dateOfExpiry;
	
	public CreditCardShopStrategy(String nm, String ccNum, String expiryDate){
		this.custname=nm;
		this.custcardNumber=ccNum;
		this.dateOfExpiry=expiryDate;
	}
	public void pay(int amount) {
		System.out.println(amount +" paid with credit/debit card");
	}


}
