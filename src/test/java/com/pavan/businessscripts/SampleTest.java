package com.pavan.businessscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {
	@Test
	public void sampletest() throws InterruptedException 
	{
		System.out.println(" done the changes by originals");
		System.out.println(" done the changes by originals");
		System.out.println("pa1 done the changes");
		System.out.println("pa1 done the changes");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		System.out.println("pa1 done the changes");
		driver.close();

	}



}
