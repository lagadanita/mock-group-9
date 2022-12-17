package neostoxpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;



public class Neostoxhomepage

{
	@FindBy(xpath="(//a[text()='OK'])[2]") private WebElement okbutton ;
	@FindBy(xpath="(//a[text()='Close'])[5]")private WebElement closebutton ;
	@FindBy(id="lbl_username")private WebElement userName;
	@FindBy(id="lbl_curbalancetop") private WebElement balance;
	@FindBy(xpath="//span[text()='Logout']") private WebElement logout;
	
	public  Neostoxhomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void popUphandle(WebDriver driver) throws InterruptedException
	{
		
		
		
		
		UtiltyNeFile.wait(driver, 500);
		if(okbutton.isDisplayed())
		{
		okbutton.click();
		Thread.sleep(500);
		closebutton.click();
		
		Reporter.log("Handling popup", true);
	
		}
		else
		{
			Reporter.log(" NO popup", true);
		}
	}
	
	
	public String getUsername(WebDriver driver)
	{
		UtiltyNeFile.wait(driver, 500);
		
		String actualusername = userName.getText();
		
		Reporter.log("actualusername is"+actualusername, true);
		
		return actualusername;
		
		}
	
	public void logoutFromNeoStox(WebDriver driver)
	{
		
		userName.click();
		
		
		 logout.click();
		 Reporter.log("logout From NeoStox", true);
		
	}
	public String getBalance(WebDriver driver) 
	{
		UtiltyNeFile.wait(driver, 1000);
		
		String actualBalance = balance.getText();
		
		Reporter.log("actualBalance is"+actualBalance, true);
		return actualBalance;
		
	}
}
