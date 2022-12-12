package neoStoxBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.Reporter;

import neostoxpom.UtiltyNeFile;





public class Base {
	 protected static WebDriver driver;
	public void lanchbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\selenium\\chrome\\chromedriver.exe");
		
		
		
		
		
		
	driver=new ChromeDriver();
		 driver.get("https://neostox.com/sign-in");
		driver.manage().window().maximize();
		Reporter.log("lanching browser", true);
		UtiltyNeFile.wait(driver, 1000);
		
	}
	
	public  void closingbrowser() throws InterruptedException
	{
		
		Thread.sleep(500);
		driver.close();
		Reporter.log("closing browser",true);
	
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

