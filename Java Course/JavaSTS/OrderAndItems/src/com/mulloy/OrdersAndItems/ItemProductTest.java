package com.mulloy.OrdersAndItems;

public class ItemProductTest { 

	public static void main(String[] args) {
		
		Item item1 = new Item("Grape", 6.50);
		Item item2 = new Item("banana", 7.00);
		
		
		
		Order order1 = new Order("Trent");
		
		order1.addItem(item1);
		order1.getStatusMessage();
		order1.addItem(item2);
		order1.getOrderTotal();
		order1.display();
	}

}
