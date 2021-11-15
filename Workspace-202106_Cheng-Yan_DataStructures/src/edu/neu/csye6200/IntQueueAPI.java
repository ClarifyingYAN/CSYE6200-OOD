package edu.neu.csye6200;

public interface IntQueueAPI {
	int size();
	boolean isEmpty();
	boolean isFull();
	void enqueue(int item);
	int dequeue();
	int peek();
}
