package edu.neu.csye6200;

public interface IntStackAPI {
	int size();
	boolean isEmpty();
	boolean isFull();
	void push(int item);
	int pop();
	int peek();
}
