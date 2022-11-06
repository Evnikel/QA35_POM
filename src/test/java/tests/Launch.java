package tests;

import manage.ConfigurationWiki;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.MainScreen;

public class Launch extends ConfigurationWiki {
    @Test
    public void launch(){
        String detail = new MainScreen(driver).getDetail();
        Assert.assertEquals(detail,"In the news");
    }

}

