package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class MainScreen extends BaseScreen {
    public MainScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/view_card_header_title']")
    MobileElement detailView;
    @FindBy(xpath = "//*[@class='android.widget.TextView']")
    MobileElement searchButton;
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/menu_overflow_button']")
    MobileElement flowButton;

    public String getDetail() {
        return detailView.getText();
    }

    public SearchScreen clickOnTheSearchFromMainPage() {
        searchButton.click();
        return new SearchScreen(driver);
    }

    public TooltipScreen clickOnFlowButton() {
        should(flowButton,30);
        flowButton.click();
        return new TooltipScreen(driver);
    }

}
