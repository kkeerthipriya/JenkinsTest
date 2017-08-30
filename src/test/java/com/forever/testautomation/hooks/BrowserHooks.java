package com.forever.testautomation.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import java.net.MalformedURLException;

/**
 * Created by Keerthi Parepalli on 6/5/2017.
 */
public class BrowserHooks {
    @Managed
    public static WebDriver driver;
    @Before
    /**
     * Delete all cookies at the start of each scenario to avoid
     * shared state between tests
     */
    public void openBrowser() throws MalformedURLException {
   //     System.setProperty("webdriver.chrome.driver","C:\\Softwares\\chromedriver_win32\\chromedriver.exe");
        //System.setProperty("webdriver.edge.driver","C:\\Softwares\\microsoft-edge\\MicrosoftWebDriver.exe");
        System.out.println("Called openBrowser");
     //   driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        System.out.println("Finshed ############################");
        /*driver.close();*/
    }

}
