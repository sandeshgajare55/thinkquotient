package com.Class_Basic_Thread;

public class Thread_demo  extends Thread {
	
	private int cnt=0;
	public void run()
	{
		int x=0;
		cnt++;
		System.out.println("Priority Of Thread : "+Thread.currentThread().getPriority());
		System.out.println("Counter is : "+cnt);
		System.out.println("Thread State : "+Thread.currentThread().getState());
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		
	Thread_demo t = new Thread_demo();
	Thread_demo t2 = new Thread_demo();
	System.out.println("State Of Thread : "+t.getState());
		t.start();
		t2.start();
		
	}

}
