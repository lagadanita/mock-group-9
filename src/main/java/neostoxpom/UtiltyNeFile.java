package neostoxpom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;


import net.bytebuddy.utility.RandomString;

public class UtiltyNeFile
{
	public static String readDataFromPropFile(String key) throws IOException 
	{
		//create object of properties class
		Properties prop=new Properties();
		
		//create object of fileInputStream
		FileInputStream myfis=new FileInputStream ("C:\\Users\\Hp\\eclipse-workspace\\selenium\\myProperty.properties");
	
		prop.load(myfis);
		
		String value = prop.getProperty(key);
		return value;
		
		}
	//2. take scrrenshot
		public static void takescreenshot(WebDriver driver,String fileName) throws IOException
		{

			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String a=RandomString.make(3);
			File des=new File("C:\\Users\\Hp\\Desktop\\selenium\\SCRRENshot\\"+ fileName+a+".png");
			FileHandler.copy(src, des);
			//Reporter.log("taking screenshot", true);
		}
		//3.scrolling
		public static void scrollIntoView(WebDriver driver,WebElement element)
		{
		 
			 JavascriptExecutor js = ((JavascriptExecutor)driver);
			  
		
			js.executeScript("arguments[0].scrollIntoView(true)", element);
			//Reporter.log("scroll into view"+element.getText(), true);
		}
		
		public static void wait(WebDriver driver,int waittime)
		{
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waittime));
			//Reporter.log("waits for"+waittime+"milis", true);
			
		}

}
