package com.Class_Basic_Thread;

public class Thread_Runnable_1 implements Runnable {

	private int cnt=0;
	public void run() {
		cnt++;
		System.out.println(Thread.currentThread().getName());
		System.out.println("Count : "+cnt);
		doTask();
	}
	
	public void doTask()
	{
		int x=10;
		System.out.println("x : "+x);
		x++;
	}
	
	public static void main(String args[])
	{
		Runnable r = new Thread_Runnable_1();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
		
	}
}
