package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class DriverConfig {
    private final String DRIVER_PATH = "src/main/resources/chromedriver.exe";
    private final String EXE_PATH = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
    public WebDriver getDriver (){
        Map<String, Object> pref = new HashMap<String, Object>();
        pref.put("download.default_directory", "src/main/resources" );
        ChromeOptions options = new ChromeOptions();
        options.setBinary(EXE_PATH);
        options.setExperimentalOption("pref", pref );
        options.addArguments("--headless");
        options.addArguments("--safebrowsing-disable-download-protection");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().fullscreen();
        return driver;

    }

}
