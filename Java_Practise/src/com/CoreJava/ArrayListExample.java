package com.Collections;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) 
	{
		ArrayList<String> list1=new ArrayList<String>();
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
