package edu.neu.csye6200;

public class GenericStack<T> implements GenericStackAPI<T>{
	
	private Object[] arr;
	
	private int capacity;
	
	private int top; // index
	
	public GenericStack(int capacity) {
		arr = new Object[capacity];
		this.capacity = capacity;
		top=-1;
	}

	@Override
	public int size() {
		return top+1;
	}

	@Override
	public boolean isEmpty() {
		return top==-1;
	}

	@Override
	public boolean isFull() {
		return capacity==top+1;
	}

	@Override
	public void push(T item) {
		if (isFull()) {
			System.exit(1);
		}
		System.out.println("Inserting " + item);
		arr[++top] = item;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T pop() {
		if (isEmpty())
			System.exit(1);
		System.out.println("Removing " + peek());
		return (T) arr[top--];
	}

	@SuppressWarnings("unchecked")
	@Override
	public T peek() {
		if (isEmpty())
			System.exit(1);
		
		return (T) arr[top]; 
	}
	
	public static void demo() {
		System.out.println("generic data stack demo:");
		GenericStackAPI<String> q = new GenericStack<>(5);
		q.push("one"); // 1st in
		q.push("two"); // 2nd in
		q.pop(); // 2nd out is 2
		q.pop(); // 1st out is 1
		q.push("two"); // 3rd in
		System.out.println("Top element is: " + q.peek());
		System.out.println("Stack size is " + q.size());
		q.pop(); // 3rd out is 3
		if ( q.isEmpty() )
		     System.out.println("Stack Is Empty");
		else
		     System.out.println("Stack Is Not Empty");
		
		System.out.println("generic data stack end.\n");
	}

}
