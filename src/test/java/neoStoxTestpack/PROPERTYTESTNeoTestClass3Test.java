package neoStoxTestpack;

import org.testng.annotations.Test;

import neoStoxBase.Base;
import neostoxpom.NeoStoxSignLogin;
import neostoxpom.Neostoxhomepage;
import neostoxpom.Neostoxpasswordpage;
import neostoxpom.UtiltyNeFile;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;

import org.testng.annotations.AfterClass;
@Listeners(neoStoxTestpack.Listener.class)
public class PROPERTYTESTNeoTestClass3Test extends Base
//ValidateNeoStoxUserNameUsingPropertyFile
{
	
	
	NeoStoxSignLogin signIn;
	Neostoxpasswordpage passWord;
	 Neostoxhomepage home;

	 
	 
	 
	 @BeforeClass
	  public void launchNeoStox()
	  {
		  lanchbrowser();
		  signIn=new NeoStoxSignLogin(driver); 
		  passWord=new Neostoxpasswordpage (driver);
			home=new Neostoxhomepage(driver);
	  }
  @BeforeMethod
  public void loginToNeoStox() throws EncryptedDocumentException, IOException, InterruptedException 
  {
	  signIn.sendMoNum(driver,UtiltyNeFile.readDataFromPropFile("mobileNum"));
	  signIn.clikSignUp(driver);
	  Thread.sleep(500);
	  passWord.sendpassword(driver,UtiltyNeFile.readDataFromPropFile("password"));
	  passWord.clicksubmitbutton(driver);
	  Thread.sleep(500);
	  home.popUphandle(driver);
	  
 }
 
  @Test
  public void validateUsername() throws EncryptedDocumentException, IOException
  {
	  Assert.assertEquals(home.getUsername(driver),UtiltyNeFile.readDataFromPropFile("username"),"Tc is fail actual and expected are not equal");
	  
  }
  

  @AfterMethod
  public void logoutFromApplication() throws InterruptedException
  {
	  Thread.sleep(500);
	  home.logoutFromNeoStox(driver);
  }

  

  @AfterClass
  public void ClosingBr() throws InterruptedException 
  {
	  Thread.sleep(500);
	  closingbrowser();
  }

}
