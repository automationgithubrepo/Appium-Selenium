package SeleniumIntegration;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CalculatorAutomation 
{
	public static AndroidDriver ad ;
	@BeforeTest
	public static void LunchApp() throws InterruptedException, MalformedURLException
	{
	// Start Appium server before test execution//	
		
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability("deviceName", "A");
	dc.setCapability("platformVersion", "9");
	dc.setCapability("platformName", "Android");
//	dc.setCapability("appWaitActivity", "com.android.packageinstaller.permission.ui.GrantPermissionsActivity");
//	dc.setCapability("appWaitPackage", "com.google.android.packageinstaller");
//	dc.setCapability("adbExecTimeout", "20000");
//	dc.setCapability("appWaitDuration", "20000");
	File f= new File("E:\\MobileWP\\Appium\\apk\\Calculator.apk");
	dc.setCapability("app", f.getAbsolutePath());
	ad = new AndroidDriver<WebElement>(new URL("http://192.168.43.59:4723/wd/hub"), dc);
	System.out.println("!!!Application Launched!!!");
	Thread.sleep(3000);
	//ad.findElementById("com.android.packageinstaller:id/do_not_ask_checkbox").click();
	}
	@Test
	public static void AddFunction() throws InterruptedException
	{
      ad.findElementById("com.google.android.calculator:id/digit_7").click();
      ad.findElementByAccessibilityId("plus").click();
      ad.findElementById("com.google.android.calculator:id/digit_8").click();
      ad.findElementByAccessibilityId("equals").click();
	}
	@Test(priority=1)
	public static void SubtractFunction() throws InterruptedException
	{
	ad.findElementById("com.google.android.calculator:id/digit_1").click();
    ad.findElementById("com.google.android.calculator:id/digit_2").click();
    ad.findElementByAccessibilityId("minus").click();
    ad.findElementById("com.google.android.calculator:id/digit_8").click();
    ad.findElementByAccessibilityId("equals").click();
    Thread.sleep(2000);
    ad.findElementByAccessibilityId("clear").click();

	}
	@AfterTest
	public static void QuitDriver()
	{
      ad.quit();
      System.out.println("!!!Test Executed Successfully!!!");
	}
}
