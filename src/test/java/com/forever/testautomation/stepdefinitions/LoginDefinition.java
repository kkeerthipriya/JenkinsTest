package com.forever.testautomation.stepdefinitions;

import com.forever.testautomation.steps.LoginSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.*;
import net.thucydides.core.annotations.Steps;

/**
 * Created by Keerthi Parepalli on 8/5/2017.
 */
public class LoginDefinition {

    /* public WebDriver driver;
     public AuthStepDefn(){
         driver = BrowserHooks.driver;
     }*/
    @Steps
    LoginSteps loginSteps=new LoginSteps();
//Login to Mono UAT

    @Given("^I am peach mode user$")
    public void i_am_registered_user() throws Throwable {
        loginSteps.openBrowser();
    }

    @When("^I open peachmode '(.*)' and '(.*)'$")
    public void i_enter_the_login_details_as_k_keerthipriya_gmail_com_and_kiran(String uname,String pwd) throws Throwable {
        loginSteps.enterLoginDetails(uname,pwd);
    }

    @Then("^I should login to the forever new$")
    public void i_should_login_to_the_forever_new_website() throws Throwable {
    }


}

