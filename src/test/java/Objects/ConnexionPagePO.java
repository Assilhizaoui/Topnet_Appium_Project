package Objects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class ConnexionPagePO extends BasePage{

	By ConnectPannel = By.id("content_login");
	By AccountTopnetHeader = By.id("txtt");
	By Login_Field = By.id("editLogin");
	By Passwd_Field =By.id("editPsw");
	By btnLogin = By.id("btnLogin");
	By Inscription_Link= By.id("txtInscrir");	
	By Passwd_Missed_Link = By.id("txtPswOubliee");
	By Pub_Banniere = By.id("img_banniere");
	public ConnexionPagePO(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
      
	public boolean Check_Content_Pannel_Display() throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	if(driver.findElement(ConnectPannel).isDisplayed())
    		return true ;
    	else 
    		return false ;
    }
}
