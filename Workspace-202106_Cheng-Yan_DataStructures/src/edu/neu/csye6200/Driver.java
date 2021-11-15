package edu.neu.csye6200;

public class Driver {
	public static void main(String[] args) {
		IntQueue.demo();
		GenericQueue.demo();
		IntStack.demo();
		GenericStack.demo();
	}
}

/**
 * 
 * console output:
	int data queue demo:
	Adding 1
	Adding 2
	Adding 3
	Front element is: 1
	Removing 1
	Front element is: 2
	Queue size is 2
	Removing 2
	Removing 3
	Queue Is Empty
	int data queue demo end.
	
	generic data queue demo:
	Adding one
	Adding two
	Adding three
	Front element is: one
	Removing one
	Front element is: two
	Queue size is 2
	Removing two
	Removing three
	Queue Is Empty
	generic data queue demo end.
	
	int data stack demo:
	Inserting 1
	Inserting 2
	Removing 2
	Removing 1
	Inserting 2
	Top element is: 2
	Stack size is 1
	Removing 2
	Stack Is Empty
	int data stack end.
	
	generic data stack demo:
	Inserting one
	Inserting two
	Removing two
	Removing one
	Inserting two
	Top element is: two
	Stack size is 1
	Removing two
	Stack Is Empty
	generic data stack end.
 * 
 * 
 * 
 */