package Objects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePagePO extends BasePage {
    
	//Inspect HomePageElements
	By HidePageButtn = By.id("fermer");
	By Menu = By.id("menu");
	By MenuButtn = By.id("btn_menu");
	By logo = By.id("logo");
	By MapButtn = By.id("btn_map");
	By UserButtn = By.id("btn_user");
	By ConnectButtn = By.id("btnMonCompte");
	
  
    public HomePagePO(WebDriver driver) {
        super(driver);
    }

    // Method Menu button click 
    public HomePagePO MenuButtn_Click() throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.findElement(HidePageButtn).click();
    	driver.findElement(MenuButtn).click();
        return new HomePagePO(driver);
    }
    
    public boolean check_logo_display () throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	if ( driver.findElement(logo).isDisplayed()) 
    	{
    		return true ; 
    	}
    	else 
    		return false ;
    }

    public boolean check_Menu_Display () throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.findElement(HidePageButtn).click();
    	driver.findElement(MenuButtn).click();
    	if ( driver.findElement(Menu).isEnabled() ) 
    	{
    		return true ; 
    	}
    	else
    	{
    		return false ;
    	}
    }
    
    public HomePagePO connect_button_click () throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.findElement(ConnectButtn).click();
    	return new HomePagePO(driver);
    }
    
}
