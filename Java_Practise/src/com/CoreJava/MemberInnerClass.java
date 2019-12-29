package com.JavaBasics;

class MemberInnerClass
{
	private class Inner_demo
	{
		public void print()
		{
			System.out.println("This is an inner class");
		}
	}
 void display_inner()
 {
	 Inner_demo inclass=new Inner_demo();
	 inclass.print();
 }
 
 

	public static void main(String[] args)
	{
		MemberInnerClass out1=new MemberInnerClass();
		out1.display_inner();
	}

}

