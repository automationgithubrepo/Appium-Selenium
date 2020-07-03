package SeleniumIntegration;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Utilities.Screenshots;
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
		File f= new File("C:\\Users\\Dell\\git\\Appium-Selenium\\apk\\MISMizoram.apk");
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
		Thread.sleep(3000);
		System.out.println("!!!All Permission Granted!!!");
	}
	@Test(priority=1)
	public static void Login() throws InterruptedException, IOException
	{
      ad.findElement(By.id("com.android.fao.faoapplication:id/username")).sendKeys("Diganshu");
      ad.findElement(By.id("com.android.fao.faoapplication:id/password")).sendKeys("12345");
      ad.findElement(By.id("com.android.fao.faoapplication:id/sign_in_button")).click();
      Thread.sleep(3000);
      System.out.println("!!!Login Successfull!!!");
      Screenshots.TakeScreenshots(ad, "C:\\Users\\Dell\\Desktop\\New folder\\Login Screen.png");
	}
	@Test(priority=2)
	public static void Download() throws InterruptedException, IOException
	{
		ad.findElement(By.id("com.android.fao.faoapplication:id/btnDownload")).click();
		Thread.sleep(20000);
		 Screenshots.TakeScreenshots(ad, "C:\\Users\\Dell\\Desktop\\New folder\\Download.png");
		 System.out.println("!!!Latest Data Downloaded!!!");
	}
	@Test(priority=3)
	public static void Update() throws InterruptedException, IOException
	{
		ad.findElement(By.id("com.android.fao.faoapplication:id/btnUpdate")).click();
		Thread.sleep(1000);
		ad.findElement(By.id("com.android.fao.faoapplication:id/spinner1")).click();
		Thread.sleep(4000);
		 ad.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[4]")).click();
		 Thread.sleep(4000);
		 ad.findElement(By.id("com.android.fao.faoapplication:id/spinner4")).click();
			Thread.sleep(3000);
		 ad.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")).click();
		 Thread.sleep(3000);
		 ad.findElement(By.id("com.android.fao.faoapplication:id/spinner5")).click();
			Thread.sleep(3000);
		 ad.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")).click();
		 Thread.sleep(3000);
		 ad.findElement(By.id("com.android.fao.faoapplication:id/btnSubmit")).click();
			Thread.sleep(3000);
		 ad.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
		 		+ "android.view.ViewGroup/android.widget.FrameLayout[2]"
		 		+ "/android.widget.LinearLayout/"
		 		+ "android.widget.ListView/android.widget.TextView")).click();	
			Thread.sleep(3000);
		 ad.findElement(By.id("com.android.fao.faoapplication:id/Edittextfirstmonth")).clear();
			Thread.sleep(3000);
		 ad.findElement(By.id("com.android.fao.faoapplication:id/Edittextfirstmonth")).sendKeys("111");
			Thread.sleep(3000);
		 ad.findElement(By.id("com.android.fao.faoapplication:id/Edittextsecondmonth")).clear();
			Thread.sleep(3000);
		 ad.findElement(By.id("com.android.fao.faoapplication:id/Edittextsecondmonth")).sendKeys("111");
			Thread.sleep(3000);
		 ad.findElement(By.id("com.android.fao.faoapplication:id/Edittextthirdmonth")).clear();
			 Thread.sleep(3000);
		 ad.findElement(By.id("com.android.fao.faoapplication:id/Edittextthirdmonth")).sendKeys("111");
			 Thread.sleep(3000);
			 Screenshots.TakeScreenshots(ad, "C:\\Users\\Dell\\Desktop\\New folder\\Updated Data.png");
		 ad.findElement(By.id("com.android.fao.faoapplication:id/btnFinalSubmitlayout")).click();
			    Thread.sleep(2000);
		 ad.findElement(By.id("android:id/button1")).click();
		Thread.sleep(3000);
		 System.out.println("!!!Data Updated Successfully!!!");
		 ad.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		 Thread.sleep(3000);
		 ad.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		 Thread.sleep(2000);
	}
	@Test(priority=4)
	public static void Profile() throws InterruptedException, IOException
	{
	 ad.findElement(By.id("com.android.fao.faoapplication:id/btnProfile")).click();
	 Thread.sleep(3000);
	 ad.findElement(By.id("com.android.fao.faoapplication:id/btnuserDetails")).click();
	 Thread.sleep(2000);
	 Screenshots.TakeScreenshots(ad, "C:\\Users\\Dell\\Desktop\\New folder\\UserDetails.png");
	 Thread.sleep(2000);
	 ad.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	 Thread.sleep(2000);
	 ad.findElement(By.id("com.android.fao.faoapplication:id/btnmanageRole")).click();
	 Thread.sleep(2000);
	 ad.findElement(By.id("com.android.fao.faoapplication:id/spinner_services")).click();
	 Thread.sleep(2000);
	 ad.findElement(By.id("android:id/text1")).click();
	 Thread.sleep(2000);
	 System.out.println("!!!---Role Selected---!!!");
	 ad.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
	 Thread.sleep(3000);
	 ad.findElement(By.id("com.android.fao.faoapplication:id/btn_logout")).click();
	 Thread.sleep(2000);
	 ad.findElement(By.id("android:id/button1")).click();
	 System.out.println("!!!---Logged out successfully---!!!");
	}
	//@Test(priority=5)
	public static void Sync() throws InterruptedException
	{
		ad.findElement(By.id("com.android.fao.faoapplication:id/btnSync")).click();
		 System.out.println("!!!---Sync..Successfully---!!!");
	}
	@AfterTest
	public static void QuitDriver()
	{
		
     // ad.quit();
      System.out.println("!!!Test Executed Successfully!!!");
	}
}
