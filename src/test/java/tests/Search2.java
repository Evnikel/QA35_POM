package tests;

import manage.ConfigurationWiki;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import screens.MainScreen;
import screens.SearchScreen;

public class Search2 extends ConfigurationWiki {

    @BeforeMethod
    public void preConditions(){
        new MainScreen(driver).clickOnTheSearchFromMainPage();
    }

    @Test
    public void search2(){
        boolean isLiner = new SearchScreen(driver)
                .fillInText("dog")
                .closeBoard()
                .isLiner();
        Assert.assertTrue(isLiner);

    }
}

