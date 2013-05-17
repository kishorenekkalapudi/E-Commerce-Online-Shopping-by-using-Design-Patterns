package org.onlineshopping.decorator;

import org.onlineshopping.client.Common;
import org.onlineshopping.client.SellerOptions;

public class CreateItem extends CreateItemDecorator{

	@Override
	public void CreateItems(int no) {
		
		SellerOptions selleroptions=new SellerOptions();
		
		ItemClass itemclass=new ItemClass();
		itemclass.CreateNewItem(no);
		try{
			Common.BlankSpaces();
		selleroptions.MainOptions();
		}
		catch(Exception er){
			System.out.println("Error Occured:"+er.getMessage());
		}
	}

}
