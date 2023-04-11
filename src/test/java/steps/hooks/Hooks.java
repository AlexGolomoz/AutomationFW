package steps.hooks;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import utils.DriverConfig;

public class Hooks {
    private WebDriver driver = new DriverConfig().getDriver();
    @After
    public void quitDriver (){
        driver.quit();
        driver.close();
    }
}
