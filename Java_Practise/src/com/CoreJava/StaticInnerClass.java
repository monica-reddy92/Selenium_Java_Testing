package com.JavaBasics;

public class StaticInnerClass 

{
	private static class Inner
	{
		public void display()
		{
			System.out.println("Static nested class");
		}
	}
	
	public static void main(String args[])
	
	{
		StaticInnerClass.Inner sinner = new StaticInnerClass.Inner();
		sinner.display();
	}
}
