package tests;

import aquality.selenium.browser.AqualityServices;
import pages.MainPage;
import utils.EnvDataReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static aquality.selenium.browser.AqualityServices.getBrowser;
import static io.qameta.allure.Allure.step;

public abstract class BaseTest {
    protected final MainPage mainPage = new MainPage();

    @BeforeMethod
    public void setup() {
        step("Open browser and maximize the window");
        getBrowser().maximize();
        step("Go to the start Url");
        getBrowser().goTo(EnvDataReader.getEnvData().getHost());
    }

    @AfterMethod
    public void teardown() {
        step("Quiting the browser");
        if (AqualityServices.isBrowserStarted()) {
            getBrowser().quit();
        }
    }
}
