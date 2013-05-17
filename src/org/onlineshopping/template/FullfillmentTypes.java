package org.onlineshopping.template;

import org.onlineshopping.client.Common;

public class FullfillmentTypes {
	
	Fullfillments fulfill=new Fullfillments();
	
	public void OneDayShipping(){
		System.out.println("You Have Selected One Day Shipping");
		Common.Wait(500);
		fulfill.FullfillmentSuccessMessage("One");
	}
	
	public void RegularShipping(){
		System.out.println("You Have Selected Regular Shipping");
		Common.Wait(500);
		fulfill.FullfillmentSuccessMessage("Couple");
	}

}
