package com.JavaBasics;

public class Thread_Creation_UsingInterface implements Runnable
{
	public void run()
	{
		System.out.println("Thread is running");
	}
	public static void main(String[] args) 
	
	{
		Thread_Creation_UsingClass t1=new Thread_Creation_UsingClass();
		t1.run();
	}

}
