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
	File f= new File("E:\\MobileWP\\Appium\\apk\\google-maps-10-41-4.apk");
	dc.setCapability("app", f.getAbsolutePath());
	ad = new AndroidDriver<WebElement>(new URL("http://192.168.43.59:4723/wd/hub"), dc);
	System.out.println("!!!Application Launched!!!");
	Thread.sleep(3000);
	}
	@Test
	public static void AddFunction()
	{
    	  MobileElement el1 = (MobileElement) ad.findElementById("com.google.android.calculator:id/digit_7");
    	  el1.click();
    	  MobileElement el2 = (MobileElement) ad.findElementByAccessibilityId("plus");
    	  el2.click();
    	  MobileElement el3 = (MobileElement) ad.findElementById("com.google.android.calculator:id/digit_8");
    	  el3.click();
    	  MobileElement el4 = (MobileElement) ad.findElementByAccessibilityId("equals");
    	  el4.click();
    	  MobileElement el5 = (MobileElement) ad.findElementByAccessibilityId("clear");
    	  el5.click();
	}
	@AfterTest
	public static void QuitDriver()
	{
      //ad.quit();
      System.out.println("!!!Test Executed Successfully!!!");
	}
}
