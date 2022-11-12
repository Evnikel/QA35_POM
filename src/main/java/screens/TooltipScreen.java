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

    public LoginScreen clickOnLoginButton() {
        loginButton.click();
        return new LoginScreen(driver);
    }
    public boolean isLogged(){
        return log.isDisplayed();
    }

}