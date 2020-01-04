package com.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions1 
{
	public static void main(String[] args) 
	{
		Pattern p=Pattern.compile("java");
		Matcher m=p.matcher("This is java do you know java");
		while(m.find())
		{
			System.out.println("Found text"+m.group()+"at start index"+m.start()+"at end index"+m.end());
		}
		}
		}


