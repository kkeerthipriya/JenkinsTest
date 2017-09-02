package com.forever.testautomation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.forever.testautomation.hooks.BrowserHooks.driver;

/**
 * Created by Keerthi Kommuri on 6/5/2017.
 */
public class LoginDetails {


    @FindBy(how= How.XPATH, using="//*[@class='footer-container'] //*[@class='footer-link'] //a[text()='Gift Cards']")
    public static WebElement giftCards;

    @FindBy(how= How.ID, using="username")
    public static WebElement uname;

    @FindBy(how= How.ID, using="password")
    public static WebElement pwd;

    @FindBy(how= How.XPATH, using="//*[@id='credit-card-number']")
    public static WebElement creditCardNum;


}
