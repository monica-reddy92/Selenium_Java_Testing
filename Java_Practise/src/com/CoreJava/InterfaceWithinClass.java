package com.JavaBasics;

class Outer_Class
{

interface Inner
{
	void display();
	
}
}

public class InterfaceWithinClass implements Outer_Class.Inner
{
	public void display()
	{
		System.out.println("Interface within class");
	}
	
	public static void main(String args[])
	{
		InterfaceWithinClass iwc=new InterfaceWithinClass();
		iwc.display();
	}
}
