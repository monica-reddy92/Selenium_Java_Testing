package com.Collections;


import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample 
{
	public static void main(String[] args) 
	{
		LinkedList<String> list1=new LinkedList<String>();
		list1.add("abc");
		list1.add("def");
		list1.add("abc");
		Iterator it=list1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}

