package com.CoreJava;

public class Operators {

	public static void main(String[] args) 
	{
		
		//Unary operators
		int a=10,b=20;
		int c;
		boolean h=true;
		c=a++ + b++;
		System.out.println(c); //30
		c=++a + ++b;
		System.out.println(c); //34
		c=a-- - b--;
		System.out.println(c); //-10
		c=--a - --b;
		System.out.println(c);  //-10
		System.out.println(c);
		
		//Ternary
		int d=(a>b)?a:b;
		System.out.println(d);
		
		//Bitwise
		int e=1&2;
		int f=1|2;
		int g=1^2; //true only when 1 bit is true and 1 bit is false else false
		System.out.println(e+" "+f+" "+g);
		
		//instanceof		
		Operators s=new Operators();  
		System.out.println(s instanceof Operators);//true  
		
		//Shift operators
			 }  
			
	}


