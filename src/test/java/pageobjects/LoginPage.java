package pageobjects;

import org.openqa.selenium.By;

public class LoginPage {
    private final By email = By.xpath("//input[@id='email']");
    private final By password = By.xpath("//input[@id='email']");
    private final By signIn = By.xpath("//span[@branding='vshare.signin.signin']");

    public String getLoggedInUser() {
        return loggedInUser;
    }

    private final String loggedInUser = "//span[text()='##username##']";

    public By getEmail() {
        return email;
    }

    public By getPassword() {
        return password;
    }

    public By getSignIn() {
        return signIn;
    }
}
