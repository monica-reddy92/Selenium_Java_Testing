package com.JavaBasics;

abstract class AnonymousClass
{
	public abstract void display();

}

class AnonymousOuterclass
{
	public static void main(String args[])
	{
		
		AnonymousClass aclass=new AnonymousClass()
			{
		public void display()
		{
			System.out.println("Anonymous class");
			
		}
			};
	
	aclass.display();
	
}
}