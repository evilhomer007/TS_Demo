package com.teamsnap.testCases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

//@SuppressWarnings("unused")
public class TS_LoginTest_001 {
  public WebDriver driver;
  //JavascriptExecutor js;
  
  
  @BeforeMethod
//@BeforeClass

  public void setUp() {
    driver = new ChromeDriver();
	  //driver = new FirefoxDriver();
	//driver.manage().window().maximize();
	
    //js = (JavascriptExecutor) driver;
    //new HashMap<String, Object>();
    
  }
  @AfterMethod
//@AfterClass
  public void tearDown() {
	
	//driver.close();
    //driver.quit();
    
  }
  @Test
  	
  	
  	public void TS_testing() throws InterruptedException {
    driver.get("https://go.teamsnap.com/login/signin");
    driver.manage().window().setSize(new Dimension(1049, 742));
    driver.findElement(By.name("login")).click();
    driver.findElement(By.name("login")).sendKeys("qa-gi+testingpractical@teamsnap.com");
    driver.findElement(By.id("password")).sendKeys("teamsnap123");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.ByTagName.xpath("/html/body/div[1]/header/div/div[2]/div[2]/ul/li[1]/a")).click();
    driver.get("https://go.teamsnap.com/team/set_team/7933993?roster_id=101628817");
//    
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"half-reskin\"]/div[1]/div[2]/ul/li[2]/a")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div/div/div/div[1]/div[1]/div/button")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath(" /html/body/div[1]/div[3]/main/div/div/div/div[1]/div[1]/div/div[2]/div/a[1]/div/span[2]")).click();
    Thread.sleep(2000);
   
    driver.close();
    //Thread.sleep(2000);
    driver.quit();
    
    
    System.out.println("Login Test 1 completed!");
    {
     
   
    }
  
  

}
}
