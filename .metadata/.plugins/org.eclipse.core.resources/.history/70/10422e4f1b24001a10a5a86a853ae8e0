package com.OrangeHRM.OrangeHRM;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OHRM_ImageUpload {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Java\\Selenium_Java_Project\\driverFiles\\chromedriver.exe");
		WebDriver driver=null;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(100000, TimeUnit.MINUTES);
		
	driver.get("http://127.0.0.1/orangehrm-4.3.4/symfony/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Smaran3005@");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		
		WebElement pim=driver.findElement(By.id("menu_pim_viewPimModule"));
		
		Thread.sleep(5000);
		
		act.moveToElement(pim).perform();
		
		driver.findElement(By.linkText("Add Employee")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("firstName")).sendKeys("Monica");
		
		driver.findElement(By.id("lastName")).sendKeys("Reddy");
		
		String expected_employeeID=driver.findElement(By.id("employeeId")).getAttribute("value");
		System.out.println(" The expected Employee id is : "+expected_employeeID);
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("photofile")).click();
		
		Thread.sleep(10000);
		
		java.lang.Runtime.getRuntime().exec("./AutoITScripts/ProfileImageUpload.exe");
		
		
		
		
		
		
	}

}
