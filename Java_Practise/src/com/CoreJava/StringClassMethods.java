package com.JavaBasics;

import java.util.Locale;

public class StringClassMethods
{
	public static void main(String args[])
	{
		//charat
		String str1="Hello hi";
		String str2= "Hi Hello";
		String str3=new String();
		String str4="";
		String str5="good";
				System.out.println(str1.charAt(4));
		System.out.println(str1.charAt(5)); //nothing will be printed
		
		//length
		System.out.println(str1.length());
		
		//substring
		System.out.println(str1.substring(2));
		System.out.println(str1.substring(1, 3)); //el
		
		//contains
		if(str1.contains("hi"))
		{
			System.out.println("Hi is found");
		}
		else
		{
			System.out.println("Hi is not found");
		}
		
		//equals
		if(str1.equals(str2))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
		
		//isempty
		
		if(str3.isEmpty()&&str4.isEmpty())
		{
			System.out.println("Strings are empty");
			
		}
		else
		{
			System.out.println("Strings are not empty");
		}
		
		//concat
		
		str3=str1.concat(" Hie");
		System.out.println(str3);
		System.out.println(str1);
		
		//replace
		str5=str5.replace('o', 'e');
		System.out.println(str5);
		
		String str6="Hello good morning";
		str6=str6.replace("o", "i");
		System.out.println(str6);
		
		//equalsignorecase
		String str7="HELLI GIID MIRNING";
		if(str7.equalsIgnoreCase(str6))
		{
			System.out.println("Strings are equal in terms of case");
		}
		else
		{
			System.out.println("Strings are not equal in terms of case");
		}
		
		//indexof
		System.out.println(str7.indexOf('E'));
		System.out.println(str7.indexOf('I', 6));
		String str8="mm oo mm oo";
		System.out.println(str8.indexOf("mm"));
		System.out.println(str8.indexOf("mm", 2));
		
		//toLowerCase
		System.out.println(str7.toLowerCase());
		String s1 = "HELLO STRING";    
        String turkish1 = s1.toLowerCase(Locale.forLanguageTag("tr"));  
        String english1 = s1.toLowerCase(Locale.forLanguageTag("en"));  
        System.out.println(turkish1);//will print I with dot on upper side  
        System.out.println(english1);
		
		//toUpperCase
		System.out.println(str7.toUpperCase());
		String s = "hello string";    
        String turkish = s.toUpperCase(Locale.forLanguageTag("tr"));  
        String english = s.toUpperCase(Locale.forLanguageTag("en"));  
        System.out.println(turkish);//will print I with dot on upper side  
        System.out.println(english);  
		
		//valueof
		int i=20;
		String st9=String.valueOf(20);
		System.out.println(i+10);
		System.out.println(st9+10);
		
		//trim
		String str10=" movie ";
		String str11=" mm mm jj mm oo  ";
		System.out.println(str10.trim());
		System.out.println(str11.trim());
		
		//join
		
		System.out.println(String.join("-", "I","am","Monica"));
		
		//intern-split-format
		}
		
		}
	


