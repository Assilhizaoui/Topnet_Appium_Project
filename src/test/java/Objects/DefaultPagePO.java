package Objects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DefaultPagePO extends BasePage {
    By HidePageButtn = By.id("fermer");
   

    public DefaultPagePO(WebDriver driver) {
        super(driver);
    }

    public DefaultPagePO HideDefaultPage() throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.findElement(HidePageButtn).click();
        return new DefaultPagePO(driver);
    }
}