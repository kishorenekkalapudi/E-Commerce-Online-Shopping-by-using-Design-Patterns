package org.onlineshopping.decorator;

import org.onlineshopping.bridge.PaymentOptions;

public class RentItem extends RentableDecorator {

	@Override
	public void RentItemByItemId(int Item_Id) {
		PaymentOptions paymentoptions=new PaymentOptions();
		try{
			setTotalNumberOfItems();
		paymentoptions.BuyItemMenu();
		}
		catch(Exception er){
			
		}
	}

}
