package org.onlineshopping.state;

import org.onlineshopping.decorator.ItemClass;

public class ItemState implements ItemStateInterface {
	
	ItemClass itemclass=new ItemClass();

	@Override
	public void setItemAvailability(int Item_Id, String Availability) {
		
		//itemclass.setItem_Id(Item_Id);
		//itemclass.setAvailable(Availability);
	}

	@Override
	public String getItemAvailability(int Item_Id) {
		
		return "";//itemclass.getAvailable();
	}

}
