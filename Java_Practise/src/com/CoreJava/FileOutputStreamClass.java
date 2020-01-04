package com.JavaIO;

import java.io.FileOutputStream;

public class FileOutputStreamClass {
	public static void main(String args[])
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("D:\\Selenium_Maven\\Java_Practise\\src\\com\\JavaIO\\output2.txt");
			fos.write(80);
			fos.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
