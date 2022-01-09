package com.attijaribank.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.devtools.log.Log;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	static FileInputStream inputStream ;
	static Properties prop ;
    protected static AndroidDriver<MobileElement> driver ; 
   
    
    
	public void initialisation () throws IOException 
	    {
       
	File propFile = new File("src/main/resources/config/config.properties");
	
	inputStream =new FileInputStream(propFile);
	prop = new Properties();
	prop.load(inputStream) ;
	File androidapp = new File(prop.getProperty("androidAppPath"));
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.DEVICE_NAME,prop.getProperty("deviceName"));
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, prop.getProperty("platformName")); 
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, prop.getProperty("androidVersion"));
    cap.setCapability(MobileCapabilityType.APP,androidapp.getAbsolutePath());
    driver = new AndroidDriver<MobileElement>(new URL(prop.getProperty("appiumServerLink")), cap);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    
         }
	

	public String TakeSnapshot(String pictureName) throws IOException {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String Destination = "/"+ pictureName + ".png";
		File FinalDestination = new File("ScreenShots" + Destination);
		FileUtils.copyFile(src, FinalDestination);
		
		//To use in Extends report
		return Destination;

	}
	@AfterClass
	public void tearDown() {
		driver.quit();
		
	}
	
		
	public static void attendre () {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	 public static void logj(String string) {
		 Logger log = Logger.getLogger(Log.class.getName());

			log.setLevel(Level.INFO);
	 }
	}
	
	

	
