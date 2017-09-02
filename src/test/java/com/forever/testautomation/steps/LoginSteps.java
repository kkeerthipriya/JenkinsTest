package com.forever.testautomation.steps;

import com.forever.testautomation.pageobjects.LoginDetails;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static com.forever.testautomation.hooks.BrowserHooks.driver;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Keerthi Parepalli on 8/5/2017.
 */
public class LoginSteps {

    public LoginSteps() {
        driver = driver;
    }
    @Step
    public void openBrowser() {
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
        driver.get("http://site24.way2sms.com/content/index.html?");
    }
    @Step
    public void enterLoginDetails(String name,String pass){
        LoginDetails loginPage = PageFactory.initElements(driver, LoginDetails.class);
        WebElement we=loginPage.uname;

        we=loginPage.uname;
        we.sendKeys(name);
        we=loginPage.pwd;
        we.sendKeys(pass);

    }

}


