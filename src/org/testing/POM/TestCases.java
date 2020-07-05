package org.testing.POM;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.Test;

import Modules.MISAutomation;

public class TestCases 
{
	@Test
	public static void MISNagaland() throws InterruptedException, IOException 
	{
	   MISAutomation.LaunchApk("C:\\Users\\Dell\\git\\Appium-Selenium\\apk\\MISNagaland.apk");
	   MISAutomation.AllowPermissions();
	   MISAutomation.Login();
	   MISAutomation.Download();
	   MISAutomation.Update();
	   MISAutomation.Profile();
	   MISAutomation.Sync();
	   MISAutomation.QuitDriver();  
	   System.out.println("MISNagaland.apk Tested Successfully");
   }
	@Test(priority=1)
	public static void MISMizoram()throws InterruptedException, IOException
	{
	   MISAutomation.LaunchApk("C:\\Users\\Dell\\git\\Appium-Selenium\\apk\\MISMizoram.apk");
	   MISAutomation.AllowPermissions();
	   MISAutomation.Login();
	   MISAutomation.Download();
	   MISAutomation.Update();
	   MISAutomation.Profile();
	   MISAutomation.Sync();
	   MISAutomation.QuitDriver();
	   System.out.println("MISMizoram.apk Tested Successfully");
	}
}
