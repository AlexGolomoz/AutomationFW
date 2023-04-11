package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobjects.LoginPage;
import utils.DriverConfig;

import static org.junit.Assert.*;

public class LoginSteps {
    private WebDriver driver = new DriverConfig().getDriver();
    private LoginPage loginPage = new LoginPage();

    @Given("I navigate to URL")
    public void navigateToUrl() {
        driver.navigate().to("www.google.com");
    }

    @When("I login with correct credentials login {string} and password {string}")
    public void iLoginWithCorrectCredentialsLoginAndPassword(String login, String password) {
        driver.findElement(loginPage.getEmail()).sendKeys(login);
        driver.findElement(loginPage.getPassword()).sendKeys(password);
        driver.findElement(loginPage.getSignIn()).click();

    }

    @Then("I am logged in with user {string}")
    public void iAmLoggedInWithUser(String user) {
        boolean isUserDisplayed = driver.findElement(By.xpath(loginPage.getLoggedInUser().replace("##username##", user))).isDisplayed();
        Assert.assertTrue("Verify if user is logged in", isUserDisplayed);
    }
}
