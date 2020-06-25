package SeleniumIntegration;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class WhatsAppAutomation 
{
	public static AndroidDriver ad;
	@BeforeTest
	public static void LaunchApk() throws InterruptedException, MalformedURLException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "A");
		dc.setCapability("platformVersion", "9");
		dc.setCapability("platformName", "Android");
		dc.setCapability("appWaitActivity", "com.whatsapp.HomeActivity");
		dc.setCapability("appWaitPackage", "com.whatsapp");
		dc.setCapability("adbExecTimeout", "20000");
		dc.setCapability("appWaitDuration", "20000");
		File f= new File("E:\\MobileWP\\Appium\\apk\\WhatsApp.apk");
		dc.setCapability("app", f.getAbsolutePath());
		ad = new AndroidDriver<WebElement>(new URL("http://192.168.43.59:4723/wd/hub"), dc);
		System.out.println("!!!Application Launched!!!");
		Thread.sleep(2000);
	}
	@Test
	public static void TextMessage() throws InterruptedException
	{
		ad.findElementByAccessibilityId("Search").click();
		ad.findElement(By.id("com.whatsapp:id/search_src_text")).sendKeys("rinky");
		ad.findElement(By.id("com.whatsapp:id/contact_row_container")).click();
		ad.findElement(By.id("com.whatsapp:id/entry")).sendKeys("HI.....**This Message is through Automated Script**");
		ad.findElementByAccessibilityId("Send").click();
	}
	@Test(priority=1)
	public static void MakeACall() throws InterruptedException
	{
		
	}
	@Test(priority=2)
	public static void AddStatus() throws InterruptedException
	{

	}
	@AfterTest
	public static void QuitDriver()
	{
      ad.quit();
      System.out.println("!!!Test Executed Successfully!!!");
	}
	
	
	
	
}
