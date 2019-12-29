package com.JavaBasics;

public class StringBuffer_StringBuilder {

	public static void main(String[] args) 
	
	{
	StringBuffer sb=new StringBuffer("Hello");
	sb.append("Good");
	System.out.println(sb);
	sb.insert(7, "Hie"); //Value from 8th character still remains
	System.out.println(sb);
	sb.replace(9, 11, "bye");
	System.out.println(sb); //value at the last index still remains
	sb.delete(1, 3);
	System.out.println(sb);  //value at the last index still remains
	sb.reverse();
	System.out.println(sb);
	System.out.println(sb.capacity());
	}

}
