package com.JavaBasics;


interface Outer
{
	interface Inner
	{
		void display();
	}
}

public class InterfaceWithinInterface implements Outer.Inner
{
	
	public void display() 
	{
		System.out.println("Interface within interface");
	}
	public static void main(String[] args)
	
	{
	
		InterfaceWithinInterface iwi=new InterfaceWithinInterface();
		iwi.display();
	}

	

}
