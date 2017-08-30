package com.forever.testautomation.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.forever.testautomation.hooks.BrowserHooks.driver;

/**
 * Created by Keerthi Kommuri on 6/5/2017.
 */
public class GiftCardDetails {

     //This is for Gift Card purchase
    //(".//*[@class='footer-link']").

    /*@FindBy(how= How.LINK_TEXT, using="Gift Cards")
    public static WebElement giftCards;
*/

    @FindBy(how= How.XPATH, using="//*[@class='footer-container'] //*[@class='footer-link'] //a[text()='Gift Cards']")
    public static WebElement giftCards;

    @FindBy(how= How.ID, using="select_12")
    public static WebElement selectVal;

    @FindBy(how= How.ID, using="select_6")
    public static WebElement quantity;

    @FindBy(how= How.ID, using="options_11_text")
    public static WebElement senderName;

    @FindBy(how= How.ID, using="senderemail")
    public static WebElement senderEmail;

    @FindBy(how= How.ID, using="cfsenderemail")
    public static WebElement confSendEmail;

    @FindBy(how= How.ID, using="options_9_text")
    public static WebElement recName;

    @FindBy(how= How.ID, using="rcemail")
    public static WebElement recEmail;

    @FindBy(how= How.ID, using="cfrcemail")
    public static WebElement confRecEmail;

    @FindBy(how= How.ID, using="options_7_text")
    public static WebElement message;

   // @FindBy(how= How.CLASS_NAME, using="button btn-cart add-to-cart-button-super")

    @FindBy(how= How.XPATH, using="//*[@class='button btn-cart add-to-cart-button-super']")
    public static WebElement addToCart;

    @FindBy(how= How.XPATH, using="//*[@class='button cart-proceed-checkout']")
    public static WebElement proceedCheckOut;

  //  @FindBy(how= How.ID, using="credit-card-number")
    @FindBy(how= How.XPATH, using="//*[@id='credit-card-number']")
    public static WebElement creditCardNum;

    //expiration-month

    @FindBy(how= How.ID, using="expiration-month")
    public static WebElement expMonth;

    @FindBy(how= How.ID, using="expiration-year")
    public static WebElement expYear;

    @FindBy(how= How.ID, using="cvv")
    public static WebElement cvvNo;


    @FindBy(how= How.ID, using="onestepcheckout-place-order")
    public static WebElement paySecurely;

    //@FindBy(how= How.ID, using="addressreview-term-condition")
    @FindBy(how= How.XPATH, using="//*[@id='buttons']/div/label")
    public static WebElement verifyTC;

//*[@id="onestepcheckout-place-order-preview"]/span/span

    @FindBy(how= How.XPATH, using="//*[@id=\"onestepcheckout-place-order-preview\"]/span/span")
    public static WebElement submitOrder;


    //driver.switch_to.frame(driver.find_element_by_name('sidebarmenu'))


















}
