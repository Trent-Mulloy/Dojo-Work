package com.mulloy.OrdersAndItems;

import java.util.ArrayList;

public class Order {
	private String name;
	private Boolean ready;
	private ArrayList<Item> items = new ArrayList<Item>();
	//Constructors
	public Order() {
		this.name = "Guest";
		this.ready = false;
	}
	
	public Order(String name) {
		this.name = name;
		this.ready = false;
	}
	//getters/setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getReady() {
		return ready;
	}
	public void setReady(Boolean ready) {
		this.ready = ready;
	}
	public ArrayList<Item> getItems() {
		return items;
	}
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	
	public void addItem(Item x) {
		items.add(x);
		Double total = 0.00;
		total += x.getPrice();
//		System.out.println(total);
	}
	public void getStatusMessage() {
		if(this.getReady() == true) {
			System.out.println("Your order is ready!");
		}
		System.out.println("Thank you for waiting, your order will be ready soon");
	}
	public void getOrderTotal() {
		Double total = 0.0;
		for (int i = 0; i < items.size(); i++) {
			 total += items.get(i).getPrice();
			}
		System.out.println(total);
	}
	public void display() {
		for (int i = 0; i < items.size(); i++) {
			Double total = 0.0;
			total = items.get(i).getPrice();
			String item = "";
			item = items.get(i).getName();
			System.out.println(item + " - " + total);
		}
	}

}
