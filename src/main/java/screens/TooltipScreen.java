package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class TooltipScreen extends BaseScreen {
    public TooltipScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/explore_overflow_account_name']")
    MobileElement loginButton;
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/explore_overflow_log_out']")
    MobileElement log;
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/explore_overflow_log_out']")
    MobileElement logOutButton;
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/explore_overflow_account_name']")
    MobileElement accountName;

    public LoginScreen clickOnLoginButton() {
        loginButton.click();
        return new LoginScreen(driver);
    }

    public boolean isLogged() {
        return log.isDisplayed();
    }

    public MainScreen logOut() {
        should(logOutButton,40);
        logOutButton.click();
        return new MainScreen(driver);
    }

    public String getInf() {
        return  loginButton.getText();
    }

    public String getInfo() {
        return accountName.getText();
    }

    public String getLog() {
        return logOutButton.getText();
    }
}