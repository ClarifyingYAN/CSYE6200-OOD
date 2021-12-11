package edu.neu.csye6200;

import java.util.concurrent.CountDownLatch;

public class TwoAlternatingThreads {
	
	class outputUp implements Runnable {
		
		public Object lock=null;
		
		public outputUp(Object lock) {
			super();
			this.lock = lock;
		}

		@Override
		public void run() {
			try {
				synchronized (lock) {
					countDownLatch.countDown();
					for (char c = 'a'; c<='z'; c++) {
						System.out.print(c);
						lock.notify();
						lock.wait();
					}
					lock.notify();
				}
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	class outputLo implements Runnable {
		public Object lock=null;
		
		public outputLo(Object lock) {
			super();
			this.lock = lock;
		}


		@Override
		public void run() {
			try {
				countDownLatch.await();
//				Thread.sleep(10L);
				synchronized (lock) {
					for (char c = 'A'; c<='Z'; c++) {
						System.out.print(c);
						lock.notify();
						lock.wait();
					}
					lock.notify();
				}
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	// used to make sure that 'a'(lowerCase) print before 'A'(UpperCase)
	public static CountDownLatch countDownLatch = new CountDownLatch(1);
	
	public static void demo() {
		System.out.println("Final part 1 Two alternating threads:");
		Object lock = new Object();
		
		TwoAlternatingThreads td = new TwoAlternatingThreads();
		Thread t1 = new Thread(td.new outputUp(lock));
		Thread t2 = new Thread(td.new outputLo(lock));
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\n");
	}
	
}
