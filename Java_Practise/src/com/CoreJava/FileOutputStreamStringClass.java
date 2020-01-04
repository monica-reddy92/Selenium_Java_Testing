package com.JavaIO;

import java.io.FileOutputStream;

public class FileOutputStreamStringClass {

	public static void main(String[] args) 
	{
		try
		{
		FileOutputStream fos=new FileOutputStream("D:\\Selenium_Maven\\Java_Practise\\src\\com\\JavaIO\\output3.txt");
		String s="Hello Hi Welcome";
		byte[] b=s.getBytes();
		System.out.println("Byte value is");
		fos.write(b);
		fos.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
