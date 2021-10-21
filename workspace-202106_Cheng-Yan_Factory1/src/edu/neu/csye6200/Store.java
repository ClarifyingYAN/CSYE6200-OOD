package edu.neu.csye6200;

import java.util.*;

public class Store extends AbstractStore {

	public void demo() {
		// write food CSV String
		String foodFileName="./FoodItemCSV.txt";
		String[] foodCSVString = {
				"3,Beef,4.99",
				"12,Chicken,3.99"
		};
		FileUtil.write(foodFileName, Arrays.asList(foodCSVString));
		
		// write service CSV String
		String serviceFileName="./ServiceItemCSV.txt";
		String[] serviceCSVString = {
				"1,Gas,3.18",
				"10,Net,39.99"
		};
		FileUtil.write(serviceFileName, Arrays.asList(serviceCSVString));
		
		// write Electronic CSV String
		String[] electronicCSVString = {
				"2,Kindle,49.99",
				"6,Airpods,99.00"
		};
		String electronicFileName="./ElectronicItemCSV.txt";
		FileUtil.write(electronicFileName, Arrays.asList(electronicCSVString));
		
		// items list
		List<Item> items = new ArrayList<>();
		
		// read and create food objects USING food Factory
		FoodItemFactory foodItemFactory = new FoodItemFactory();
		List<String> foodItemsCSVString = FileUtil.read(foodFileName);
		foodItemsCSVString.forEach(s -> {
			Item foodItem = foodItemFactory.getObject(s);
			items.add(foodItem);
		});
		
		// read and create service objects USING service Factory
		ServiceItemFactory serviceItemFactory = ServiceItemFactory.getInstance();
		List<String> serviceItemsCSVString = FileUtil.read(serviceFileName);
		serviceItemsCSVString.forEach(s -> {
			Item serviceItem = serviceItemFactory.getObject(s);
			items.add(serviceItem);
		});
		
		// read and create electronic objects USING electronic Factory
		ElectronicItemFactory electronicItemFactory = ElectronicItemFactory.getInstance();
		List<String> electronicItemsCSVString = FileUtil.read(electronicFileName);
		electronicItemsCSVString.forEach(s -> {
			Item electronicItem = electronicItemFactory.getObject(s);
			items.add(electronicItem);
		});
		
		// before sort
		System.out.println("Before Sorted");
		items.forEach(System.out::println);
		System.out.println("");
		
		// sort
		// sort ID
		System.out.println("sort by ID");
		items.sort(Item::CompareByID);
		items.forEach(System.out::println);
		System.out.println("");
		
		// sort name
		System.out.println("sort by Name");
		items.sort(Item::CompareByName);
		items.forEach(System.out::println);
		System.out.println("");
		
		// sort price
		System.out.println("sort by Price");
		items.sort(Item::CompareByPrice);
		items.forEach(System.out::println);
		
	}

}
