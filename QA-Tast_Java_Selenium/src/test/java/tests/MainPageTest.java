package tests;

import constants.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.RedirectedPage;

public class MainPageTest extends BaseTest{
    MainPage mainPage = new MainPage();
    RedirectedPage redirectedPage = new RedirectedPage();

    @Test(priority = 1)
    public void verifyValidLoginTest(){
        mainPage.enterUsername(Credentials.EMAIL.getLabel());
        mainPage.enterPassword(Credentials.PASSWORD.getLabel());
        mainPage.clickLoginButton();

        Assert.assertTrue(redirectedPage.state().waitForDisplayed(), "Log in Successful");
    }

    @Test(priority = 2)
    public void verifyEmptyFieldLoginTest(){
        mainPage.enterUsername(Credentials.EMPTY.getLabel());
        mainPage.enterPassword(Credentials.EMPTY.getLabel());
        mainPage.clickLoginButton();

        Assert.assertTrue(redirectedPage.state().waitForDisplayed(), "Log in Failed");
    }

    @Test(priority = 3)
    public void verifyInvalidLoginTest(){
        mainPage.enterUsername(Credentials.INVALID_EMAIL.getLabel());
        mainPage.enterPassword(Credentials.INVALID_PASS.getLabel());
        mainPage.clickLoginButton();

        Assert.assertTrue(redirectedPage.state().waitForDisplayed(), "Log in Failed");
    }
}
