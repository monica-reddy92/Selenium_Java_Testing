package com.JavaBasics;

enum Enum1 
{
	Mon,Tues,Wed,Thurs,Fri,Sat,Sun;
}
public class Enums_SwitchCase 
{
	Enum1 e;
	public Enums_SwitchCase(Enum1 e)
	{
		this.e=e;
	}
public void meth1()
{
	switch(e)
	{
	case Mon:
		System.out.println("This is Monday");
	break;
	case Tues:
		System.out.println("This is Tuesday");
	break;
	case Wed:
		System.out.println("This is Wednesday");
	break;
	case Thurs:
		System.out.println("This is Thursday");
	break;
	case Fri:
		System.out.println("This is Friday");
	break;
	case Sat:
		System.out.println("This is Saturday");
	break;
	case Sun:
		System.out.println("This is Sunday");
	break;
	
	}
}
public static void main(String args[])
{
	String str="Mon";
	Enums_SwitchCase esc=new Enums_SwitchCase(Enum1.valueOf(str));
	esc.meth1();
}
}