package org.onlineshopping.decorator;

public abstract class AddItemAbstractClass {
	private int NumberOfItems;
	
	public int getNumberOfItems() {
		return NumberOfItems;
	}
	public void setNumberOfItems(int numberOfItems) {
		NumberOfItems = numberOfItems;
	}
	
	public abstract void  DisplayDynamicItems(int no);
	public abstract void  AddItem(int no);
}
