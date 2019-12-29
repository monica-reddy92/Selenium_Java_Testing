package com.JavaBasics;

public class MethodLocalInnerClass 

{
int num=20;
	public void Demo()
	{
		class Inner_class
		{
			public void display()
			{
				System.out.println("The given number is"+" "+num);
			}
		}
		Inner_class inclass=new Inner_class();
		inclass.display();
	}
	
	public static void main(String args[])
	{
		MethodLocalInnerClass minclass=new MethodLocalInnerClass();
		minclass.Demo();
	}
}
