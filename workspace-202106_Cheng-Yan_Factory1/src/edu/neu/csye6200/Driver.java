package edu.neu.csye6200;

public class Driver {
	public static void main(String[] args) {
		new Store().demo();
	}
}

/**
 * Console output:
 * 
    Before Sorted
	FoodItem [id=3, name=Beef, price=4.99]
	FoodItem [id=12, name=Chicken, price=3.99]
	ServiceItem [id=1, name=Gas, price=3.18]
	ServiceItem [id=10, name=Net, price=39.99]
	ElectronicItem [id=2, name=Kindle, price=49.99]
	ElectronicItem [id=6, name=Airpods, price=99.0]
	
	sort by ID
	ServiceItem [id=1, name=Gas, price=3.18]
	ElectronicItem [id=2, name=Kindle, price=49.99]
	FoodItem [id=3, name=Beef, price=4.99]
	ElectronicItem [id=6, name=Airpods, price=99.0]
	ServiceItem [id=10, name=Net, price=39.99]
	FoodItem [id=12, name=Chicken, price=3.99]
	
	sort by Name
	ElectronicItem [id=6, name=Airpods, price=99.0]
	FoodItem [id=3, name=Beef, price=4.99]
	FoodItem [id=12, name=Chicken, price=3.99]
	ServiceItem [id=1, name=Gas, price=3.18]
	ElectronicItem [id=2, name=Kindle, price=49.99]
	ServiceItem [id=10, name=Net, price=39.99]
	
	sort by Price
	ServiceItem [id=1, name=Gas, price=3.18]
	FoodItem [id=12, name=Chicken, price=3.99]
	FoodItem [id=3, name=Beef, price=4.99]
	ServiceItem [id=10, name=Net, price=39.99]
	ElectronicItem [id=2, name=Kindle, price=49.99]
	ElectronicItem [id=6, name=Airpods, price=99.0]
 * 
 */

