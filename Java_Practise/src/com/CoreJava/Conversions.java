package com.JavaBasics;

public class Conversions {

	public static void main(String[] args)
	{
	
//String to int
		String s1="20";
		int a=Integer.parseInt(s1);
		System.out.println(a+10); //30
		
		//String to Integer
		String s2="20";
		int b=Integer.valueOf(s2);
		System.out.println(b+10); //30
		
		//int to string
		String s3=String.valueOf(a); //20
		System.out.println(s3+10); //2010
		
		String s4=Integer.toString(a);
		System.out.println(s4+10); //2010
		

		//Integer to int
		Integer c= new Integer(50);
		int d=new Integer(c);
		System.out.println(d);
		
	}

}
