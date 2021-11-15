package edu.neu.csye6200;

public interface GenericStackAPI<T> {
	int size();
	boolean isEmpty();
	boolean isFull();
	void push(T item);
	T pop();
	T peek();
}
