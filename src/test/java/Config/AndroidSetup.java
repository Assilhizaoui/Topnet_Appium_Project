package Config;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class AndroidSetup {
	
	 protected AndroidDriver driver;

	    protected void prepareAndroidForAppium() throws MalformedURLException, InterruptedException {
	    	
	    	DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("appium-version", "1.22.2");
	        capabilities.setCapability("platformName", "Android");
	        capabilities.setCapability("platformVersion", "7.0");
	        capabilities.setCapability("deviceName", "Nexus 5 API 24");
	        //capabilities.setCapability("udid", "32007c485359c5c5");
	        capabilities.setCapability("app", "C:\\Users\\visiteur1\\eclipse-workspace\\TopnetAppiumTestProject\\apps\\TOPNET APP_v1.6.1_apkpure.com.apk");
	        capabilities.setCapability("appPackage", "com.medianet.topnetapp");
	        capabilities.setCapability("appActivity", "com.medianet.topnetapp.MainActivity");
	        capabilities.setCapability("MobileCapabilityType.NEW_COMMAND_TIMEOUT", "120");
	       
	        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	        System.out.println("Test Begin");
}
	    
	    protected void uninstallApk ()
	    {
	    	//driver.removeApp("com.flipkart.android");
	    }
}