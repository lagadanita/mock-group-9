package neostoxpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class Neostoxpasswordpage 
{
@FindBy(xpath="//input[@id='txt_accesspin']")private WebElement password;
@FindBy(id="lnk_submitaccesspin")private WebElement submitbutton;


public Neostoxpasswordpage( WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void sendpassword(WebDriver driver,String pass) throws InterruptedException
{
	UtiltyNeFile.wait(driver, 1000);
	password.sendKeys(pass);
	//Reporter.log("sending mobile no", true);
	Thread.sleep(500);
	
}
public void clicksubmitbutton(WebDriver driver)
{
	UtiltyNeFile.wait(driver, 1000);
	submitbutton.click();
	//Reporter.log("click on submit button", true);
	
}


}
