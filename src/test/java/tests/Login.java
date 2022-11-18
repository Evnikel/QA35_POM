package tests;

import manage.ConfigurationWiki;
import manage.DataProviderWiki;
import model.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.MainScreen;

public class Login extends ConfigurationWiki {

    @Test
    public void login1(){
        logger.info("Starts login without logout---");
        User user = User.builder().userName("Evaa1234").password("Eva1234$@").build();

        boolean isLogged = new  MainScreen(driver)
                .clickOnFlowButton()
                .clickOnLoginButton()
                .fillInLofinForm(user)
                .clickOnFlowButton()
                .isLogged();
        Assert.assertTrue(isLogged);


    }

    @Test(dataProvider = "loginData", dataProviderClass = DataProviderWiki.class)
    public void login2( User user) {
        logger.info("Starts login with model---");
        String inf = new MainScreen(driver)
                .clickOnFlowButton()
                .clickOnLoginButton()
                .fillInLofinForm(user)
                .clickOnFlowButton()
                .logOut()
                .clickOnFlowButton()
                .getInf();

        Assert.assertEquals(inf, "Log in to Wikipedia");
    }

    @Test(dataProvider = "loginDataCsv", dataProviderClass = DataProviderWiki.class)
    public void login6( User user) {
        String inf = new MainScreen(driver)
                .clickOnFlowButton()
                .clickOnLoginButton()
                .fillInLofinForm(user)
                .clickOnFlowButton()
                .logOut()
                .clickOnFlowButton()
                .getInf();

        Assert.assertEquals(inf, "Log in to Wikipedia");
    }



    @Test
    public void login3() {
        logger.info("Starts login without model---");
        new MainScreen(driver)
                .clickOnFlowButton()
                .clickOnLoginButton()
                .fillInLofinForm2("Evaa1234", "Eva1234$@")
                .clickOnFlowButton()
                .logOut();

    }

    @Test
    public void login4() {
        User user = User.builder().userName("Evaa1234").password("Eva1234$@").build();
        String info = new MainScreen(driver)
                .clickOnFlowButton()
                .clickOnLoginButton()
                .fillInLofinForm(user)
                .clickOnFlowButton()
                .getInfo();
        Assert.assertEquals(info,"Evaa1234");


    }

    @Test
    public void login5() {
        User user = User.builder().userName("Evaa1234").password("Eva1234$@").build();
        String logOut = new MainScreen(driver)
                .clickOnFlowButton()
                .clickOnLoginButton()
                .fillInLofinForm(user)
                .clickOnFlowButton()
                .getLog();
        Assert.assertEquals(logOut,"Log out");


    }



}