package Tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Config.AndroidSetup;
import Objects.HomePagePO;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class HomePageTest extends AndroidSetup {
	 private static final Logger logger = LogManager.getLogger(HomePageTest.class);
	   
   @BeforeClass
   public void setUp() throws Exception {
       prepareAndroidForAppium();
       logger.info("Nexus device Ready for Test Home Page"); 
   }
   @AfterClass
   public void tearDown() throws Exception {
   	
   	driver.quit();
   }
//@Test
  // public void HomePageTest() throws InterruptedException {
	//   new HomePagePO(driver).MenuButtn_Click();
  //     logger.info("Click on Menu button Action is performed"); 
  // }
   @Test 
   public void Check_Topnet_Logo_Display () throws InterruptedException 
   {
	   if (new HomePagePO(driver).check_logo_display()== true)
	   {
		   logger.info("Logo Topnet is displayed : Test OK ");
	   }
	   else
	   {
		   logger.info("Logo Topnet is not displayed : Test KO ");
	   }
   }
   
   @Test 
   public void Check_Menu_Display () throws InterruptedException 
   {
	   if ( new HomePagePO(driver).check_Menu_Display())
	   {
		   logger.info("Menu is displayed : Test OK "); 
	   }
	   else
	   {
		   logger.info("Menu is not displayed : Test KO");
	   }
   }
}