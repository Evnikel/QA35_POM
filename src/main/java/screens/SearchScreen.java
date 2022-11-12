package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class SearchScreen extends BaseScreen{
    public SearchScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/search_src_text']")
    MobileElement textBox;
    @FindBy(xpath = "//*[@resource-id='org.wikipedia:id/page_list_item_container']")
    MobileElement liner;

    public SearchScreen fillInText(String text) {
        type(textBox,text);
        return this;
    }
    public SearchScreen closeBoard(){
        hideKeyboard();
        return this;
    }
    public boolean isLiner(){
        return liner.isDisplayed();
    }
}
