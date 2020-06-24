package SeleniumIntegration;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;

public class DesiredCapabilitiesForAndroid {
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
	}
	
}
