package com.forever.testautomation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Keerthi Kommuri on 6/5/2017.
 */
public class LoginPage {

    //This is for Mono UAT login

    @FindBy(how= How.LINK_TEXT, using="Log in")
    public static WebElement login;

    @FindBy(how= How.ID, using="email")
    public static WebElement uname;

    @FindBy(how= How.ID, using="pass")
    public static WebElement pwd;

    @FindBy(how= How.ID, using="send2")
    public static WebElement logn;


}
