package com.JavaBasics;

import java.util.StringTokenizer;

public class StringTokenizerClass

{
public static void main(String[] args)
{
	StringTokenizer str1=new StringTokenizer("I am Monica"," ");
	StringTokenizer str2=new StringTokenizer("Hi Hello");
	while(str1.hasMoreTokens())
	{
		System.out.println(str1.nextElement());
	}
	
	while(str2.hasMoreElements())
	{
		System.out.println(str2.nextToken(" "));
	}
	
	//Program to get rid of multiple spaces in a string
	
	String str3="ab    cd  ef     gh";
	StringTokenizer str4=new StringTokenizer(str3, " ");
	StringBuffer sb=new StringBuffer();
	while(str4.hasMoreElements())
	{
		sb.append(str4.nextToken()).append(" ");
	}
	System.out.println(sb);
	}
}
