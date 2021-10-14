package edu.neu.csye6200;

import java.util.*;

public class Item {
	private float price;
	
	private String name;
	
	private Category catogary;

	public Item(String name, Category catogary, float price) {
		super();
		this.price = price;
		this.name = name;
		this.catogary = catogary;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCatogary() {
		return catogary;
	}

	public void setCatogary(Category catogary) {
		this.catogary = catogary;
	}
	
	public static void demo() {
		
		float walletMoney = 20f;
		
		Item item1 = new Item("Milk", Category.DAIRY, 2.99f);
		Item item2 = new Item("Beef Ground", Category.MEAT, 5.99f);
		Item item3 = new Item("Food Oil", Category.GROCERY, 1.49f);
		Item item4 = new Item("Coca Cola", Category.BEVERAGE, 1.5f);
		Cart cart = new Cart();
		cart.addItem(item1, 2f);
		cart.addItem(item2);
		cart.addItem(item3);
		cart.addItem(item4, 4f);
		
		float cost = cart.checkOut();
		System.out.printf("Change: $%.2f", (walletMoney-cost));
	}
	
	public static void main(String[] Args) {
		demo();
	}
}

class Cart {
	// it's better to create in another class
	
	private Map<String, Float> ItemQuantityMap = new HashMap<>();
	
	LinkedList<Item> items = new LinkedList<>();
	
	public void emptyCart() {
		ItemQuantityMap.clear();
	}
	
	public String addItem(Item item) {
		if (ItemQuantityMap.containsKey(item.getName())) {
			ItemQuantityMap.replace(item.getName(), ItemQuantityMap.get(item.getName())+1);
		} else {
			ItemQuantityMap.put(item.getName(), 1f); // default quantity is 1;
		}
		items.add(item);
		return item.getName();
	}
	
	public String addItem(Item item, Float quantity) {
		if (ItemQuantityMap.containsKey(item.getName())) {
			ItemQuantityMap.replace(item.getName(), ItemQuantityMap.get(item.getName())+quantity);
		} else {
			ItemQuantityMap.put(item.getName(), quantity); // default quantity is 1;
		}
		items.add(item);
		return item.getName();
	}
	
	public float checkOut() {
		float totalPrice = 0;
		int k=0;
		System.out.printf("%s %-12s %-3s %-4s %-8s\n", "No", "Name", "Price", "quantity", "getCatogary");
		for(Item item : items) {
			k++;
			float price = item.getPrice();
			float quantity = ItemQuantityMap.get(item.getName());
			System.out.printf("%d. %-12s %-6.1f *%-8.2f *%-8s\n", k, item.getName(), price, quantity, item.getCatogary());
			totalPrice += quantity * price;
		}
		
		System.out.println("Total Amount: $" + totalPrice);
		
		return totalPrice;
	}
	
}

enum Category {
	MEAT,
	BEVERAGE,
	DAIRY,
	GROCERY,
	BAKERY,
	OTHERS;
}

