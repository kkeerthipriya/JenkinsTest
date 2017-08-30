package com.forever.testautomation.stepdefinitions;

import com.forever.testautomation.steps.LoginSteps;
import com.forever.testautomation.steps.NewGiftCardSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.*;
import net.thucydides.core.annotations.Steps;

/**
 * Created by Keerthi Parepalli on 8/5/2017.
 */


public class GiftCardDefn {

    /* public WebDriver driver;
     public AuthStepDefn(){
         driver = BrowserHooks.driver;
     }*/
    @Steps
    NewGiftCardSteps giftcard = new NewGiftCardSteps();
    LoginSteps loginSteps=new LoginSteps();


//Purchase a gift card
    @Given("^I open the Forever New home page '(.*)' and '(.*)'$")

    public void i_open_the_Forever_Page(String uname,String pwd) throws Throwable {
          loginSteps.openBrowser();
          loginSteps.enterLoginDetails(uname,pwd);
    }

    @When("^I open buy gift cards page$")
    public void i_open_gift_card_Page() throws Throwable {
        giftcard.goToGiftCardPage();
    }

    @And("^give all the details '(.*)' and '(.*)' and '(.*)' and '(.*)' and '(.*)' and '(.*)' and '(.*)' and '(.*)' and '(.*)' and '(.*)' and '(.*)'$")

    public void i_give_all_giftCard_details(String GiftCardValue,String QTY, String SenName,String SenEmail,String RcvName,String RcvEmail,String Msg,String CreditCardNo,String ExpMon,String Expyr,String CVV) throws Throwable {
        giftcard.enterGiftCardDetails(GiftCardValue,QTY,SenName,SenEmail,RcvName,RcvEmail,Msg,CreditCardNo,ExpMon,Expyr,CVV);
    }

    @Then("^I should login to the forever new website$")
    public void i_should_not_be_able_to_go_to_next_page() throws Throwable {

    }

}










