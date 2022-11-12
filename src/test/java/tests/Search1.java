package tests;

import manage.ConfigurationWiki;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.MainScreen;

public class Search1 extends ConfigurationWiki {

    @Test
    public void search1(){
        boolean isLiner = new MainScreen(driver)
                .clickOnTheSearchFromMainPage()
                .fillInText("dog")
                .closeBoard()
                .isLiner();
        Assert.assertTrue(isLiner);
    }
}
