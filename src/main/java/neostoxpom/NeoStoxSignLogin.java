package neostoxpom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;



public class NeoStoxSignLogin 
{
	@FindBy(id="MainContent_signinsignup_txt_mobilenumber")private WebElement mobilenofield;
	@FindBy(id="lnk_signup1")private WebElement signupbutton;
public NeoStoxSignLogin(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void sendMoNum(WebDriver driver ,String mobNum)
{
	UtiltyNeFile.wait(driver, 1000);
	mobilenofield.sendKeys(mobNum);
	Reporter.log("sending mobileNo", true);
}
public void clikSignUp(WebDriver driver)
{
	UtiltyNeFile.wait(driver, 1000);
	signupbutton.click();
	Reporter.log("click on sign up button", true);

	
	
	
}
}
