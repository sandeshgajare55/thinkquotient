package com.Class_Basic_Thread;

public class Thread_methods extends Thread {
	
	public Thread_methods() {
		super("Saigon");
	}
	public void run()
	{
		int x=0;
		System.out.println(Thread.currentThread().getName());
		while(true)
		{
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(x);
			x++;
		}
		
	}
	public static void main(String args[]) throws InterruptedException
	{
		Thread_methods t = new Thread_methods();
		t.start();
	}

}
