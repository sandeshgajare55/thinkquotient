package com.Class_Basic_Thread;

public class Thread_join extends Thread {

	static int cnt = 0;

	public Thread_join(String s) {
		super(s);
	}

	public void run() {
		String n = Thread.currentThread().getName();
		System.out.println(n + " Started....");

		for (int i = 1; i <= 3; i++) {
			cnt++;
			System.out.println("Count : " + cnt);
		}
		System.out.println(Thread.currentThread().getName()+" Finished");
	}

	public static void main(String args[]) throws InterruptedException {
		Thread t1 = new Thread_join("Thread t1");
		Thread t2 = new Thread_join("Thread t2");

		t1.start();
		t1.join();
		t2.start();

		System.out.println("Main Count : " + cnt);
	}
}
