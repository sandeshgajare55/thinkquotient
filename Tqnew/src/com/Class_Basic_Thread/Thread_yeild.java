package com.Class_Basic_Thread;

public class Thread_yeild extends Thread {
	public void run()
	{
		System.out.println("Thread : "+Thread.currentThread().getName()+" Starts with priority : "+Thread.currentThread().getPriority());
		for(int i=1;i<=5;i++)
		{
			if(i==3)
			{
				Thread.currentThread().yield();
				System.out.println(i);
			}
		}
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String args[])
	{
		Thread_yeild t1= new Thread_yeild();
		Thread_2 t2= new Thread_2();

		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(3);
		
		t1.start();
		t2.start();
		
		System.out.println("Main Thread Completed its execution : ");
	}
}

 class Thread_2 extends Thread {
	public void run()
	{
		System.out.println("Thread : "+Thread.currentThread().getName()+" Starts with priority : "+Thread.currentThread().getPriority());
		for(int j=1;j<=3;j++)
		{
			System.out.println(j);
		}
		System.out.println(Thread.currentThread().getName());
	}

}