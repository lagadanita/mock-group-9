package neoStoxTestpack;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import neoStoxBase.Base;
import neostoxpom.UtiltyNeFile;


public class Listener extends Base implements ITestListener
{
public void onTestSuccess(ITestResult result) {

	Reporter.log("tc is pass",true);
}
public void onTestFailure(ITestResult result) {
	
	try {
		UtiltyNeFile.takescreenshot(driver, result.getName());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
public void onStart(ITestContext context) {
	Reporter.log("Tc case is on start", true);
	}
public void onTestSkipped(ITestResult result) {
	Reporter.log("Tc is skipped", true);
	}
public void onFinish(ITestContext context) {
	Reporter.log("Tc is finish", true);
	}

}
