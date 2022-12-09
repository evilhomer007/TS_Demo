package com.teamsnap.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public String baseUrl = "https://go.teamsnap.com/login/signin\n";
	public String username = "qa-gi+testingpractical@teamsnap.com";
	public String password = "teamsnap123";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
//			//System.setProperty("webdriver.chrome.driver","/TeamSnapDemo/Drivers/chromedriver");
//			System.setProperty("webdriver.gecko.driver","/TeamSnapDemo/Drivers/geckodriver");
//			//WebDriverManager.chromedriver().setup();
//			//WebDriverManager.firefoxdriver().setup();
//			driver=new ChromeDriver();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}

}




