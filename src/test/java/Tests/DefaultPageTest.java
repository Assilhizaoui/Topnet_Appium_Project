package Tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Config.AndroidSetup;
import Objects.DefaultPagePO;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DefaultPageTest extends AndroidSetup {
	 private static final Logger logger = LogManager.getLogger(DefaultPageTest.class);
    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();
        logger.info("Nexus device Ready for default Test page"); 
    }

    @AfterClass
    public void tearDown() throws Exception {
    	driver.quit();
    }

    @Test
    public void DefaultPageTest() throws InterruptedException {
        new DefaultPagePO(driver).HideDefaultPage();
        logger.info("Default page is hide"); 
    }

}

