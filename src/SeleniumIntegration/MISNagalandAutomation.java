package SeleniumIntegration;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MISNagalandAutomation 
{
	public static AndroidDriver ad ;
	@BeforeTest
	public static void LaunchApk() throws InterruptedException, MalformedURLException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "A");
		dc.setCapability("platformVersion", "9");
		dc.setCapability("platformName", "Android");
		dc.setCapability("appWaitActivity", "com.android.packageinstaller.permission.ui.GrantPermissionsActivity");
		dc.setCapability("appWaitPackage", "com.google.android.packageinstaller");
		dc.setCapability("adbExecTimeout", "20000");
		dc.setCapability("appWaitDuration", "20000");
		File f= new File("C:\\Users\\Dell\\git\\Appium-Selenium\\apk\\MISNagaland.apk");
		dc.setCapability("app", f.getAbsolutePath());
		ad = new AndroidDriver<WebElement>(new URL("http://192.168.43.59:4723/wd/hub"), dc);
		System.out.println("!!!Application Launched!!!");
		Thread.sleep(2000);
	}
	@Test
	public static void AllowPermissions() throws InterruptedException
	{
		ad.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		Thread.sleep(2000);
		ad.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		Thread.sleep(3000);
		ad.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
	}
	@Test(priority=1)
	public static void SubtractFunction() throws InterruptedException
	{

	}
	@Test(priority=2)
	public static void Multi() throws InterruptedException
	{

	}
	@Test(priority=3)
	public static void Divide() throws InterruptedException
	{


	}
	@AfterTest
	public static void QuitDriver()
	{
      ad.quit();
      System.out.println("!!!Test Executed Successfully!!!");
	}
}
