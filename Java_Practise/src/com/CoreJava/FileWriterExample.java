package com.JavaIO;

import java.io.FileOutputStream;
import java.io.FileWriter;

public class FileWriterExample {
	
	public static void main(String[] args) 
	{
		try
		{
		FileWriter fos=new FileWriter("D:\\Selenium_Maven\\Java_Practise\\src\\com\\JavaIO\\output4.txt");
		fos.write("Hello Hi Welcome");
		fos.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

}
}
