package edu.neu.csye6200;

public class GenericQueue<T> implements GenericQueueAPI<T>{
	
	private Object[] arr;
	
	private int count;
	
	private int capacity;
	
	private int front; // where delete
	
	private int rear; // where add
	
	public GenericQueue(int capacity) {
		this.capacity = capacity;
		arr = new Object[capacity];
		count = 0;
		front = 0;
		rear = -1;
	}

	@Override
	public int size() {
		return count;
	}

	@Override
	public boolean isEmpty() {
		return count==0;
	}

	@Override
	public boolean isFull() {
		return count==capacity;
	}

	@Override
	public void enqueue(T item) {
		if(isFull()) {
//					throw new IndexOutOfBoundsException("queue is full.");
			 System.exit(1);
		}
		
		System.out.println("Adding " + item);
		rear = (rear+1)%capacity;
		arr[rear] = item;
		count++;
	}

	@Override
	public T dequeue() {
		if(isEmpty()) {
//			throw new IndexOutOfBoundsException("queue is empty.");
			 System.exit(1);
		}
		@SuppressWarnings("unchecked")
		T e = (T) arr[front];
		System.out.println("Removing " + arr[front]);
		front = (front+1)%capacity;
		count--;
		return e;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T peek() {
		if(isEmpty()) {
//			throw new IndexOutOfBoundsException("queue is empty.");
			 System.exit(1);
		}
		return (T) arr[front];
	}
	
	public static void demo() {
		System.out.println("generic data queue demo:");
		GenericQueueAPI<String> q = new GenericQueue<>(5);
		q.enqueue("one"); // 1st in
		q.enqueue("two"); // 2nd in
		q.enqueue("three"); // 3rd in
		System.out.println("Front element is: " + q.peek());
		q.dequeue();// 1st out is 1
		System.out.println("Front element is: " + q.peek());
		System.out.println("Queue size is " + q.size());
		q.dequeue();// 2nd out is 2
		q.dequeue();// 3rd out is 3
		if (q.isEmpty())
		    System.out.println("Queue Is Empty");
		else
		    System.out.println("Queue Is Not Empty");
		System.out.println("generic data queue demo end.\n");
	}
	
}
