package edu.neu.csye6200;

public class IntQueue implements IntQueueAPI {
	private int[] arr;
	
	private int count;
	
	private int capacity;
	
	private int front; // where delete
	
	private int rear; // where add

	public IntQueue(int capacity) {
		this.capacity = capacity;
		arr = new int[capacity];
		count = 0;
		front = 0;
		rear = -1;
	}

	@Override
	public boolean isFull() {
		return count==capacity;
	}

	@Override
	public void enqueue(int item) {
		// TODO Auto-generated method stub
		if(isFull()) {
//			throw new IndexOutOfBoundsException("queue is full.");
			 System.exit(1);
		}
		
		System.out.println("Adding " + item);
		rear = (rear+1)%capacity;
		arr[rear] = item;
		count++;
	}

//	@Override
//	public void dequeue() {
//		if(isEmpty()) {
////			throw new IndexOutOfBoundsException("queue is empty.");
//			 System.exit(1);
//		}
//		
//		System.out.println("Removing " + arr[front]);
//		front = (front+1)%capacity;
//		count--;
//	}
	
	@Override
	public int dequeue() {
		if(isEmpty()) {
//			throw new IndexOutOfBoundsException("queue is empty.");
			 System.exit(1);
		}
		int e = arr[front];
		System.out.println("Removing " + arr[front]);
		front = (front+1)%capacity;
		count--;
		return e;
	}

	@Override
	public int peek() {
		if(isEmpty()) {
//			throw new IndexOutOfBoundsException("queue is empty.");
			 System.exit(1);
		}
		return arr[front];
	}

	@Override
	public int size() {
		return count;
	}

	@Override
	public boolean isEmpty() {
		return count==0;
	}
	
	public static void demo() {
		System.out.println("int data queue demo:");
		IntQueueAPI q = new IntQueue(5);
		q.enqueue(1); // 1st in
		q.enqueue(2); // 2nd in
		q.enqueue(3); // 3rd in
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
		System.out.println("int data queue demo end.\n");
	}
	
}
