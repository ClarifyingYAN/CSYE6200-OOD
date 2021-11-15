package edu.neu.csye6200;

public interface GenericQueueAPI<T> {
	int size();
	boolean isEmpty();
	boolean isFull();
	void enqueue(T item);
	T dequeue();
	T peek();
}
