package com.Delta.Pages;

import com.Delta.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dildora_GiftCard_Page {

    public Dildora_GiftCard_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//img[@class='shoppingBandRight'])[4]")
    public WebElement ClickGiftCard;

    @FindBy(xpath = "(//img[@alt='gift card icon'])[2]")
    public  WebElement buyGiftCard;

    @FindBy(id = "recipientName-input")
    public WebElement putTheirName;

    @FindBy(id ="senderName-input" )
    public WebElement putYourName;

    @FindBy(xpath = "//button[.='Send A Digital Card']")
    public WebElement selectDigitalCard;

    @FindBy(id = "selectedGroupOrdinal-2-label")
    public WebElement selectHappyBirthdayDesign;

    @FindBy(xpath = "//button[.='How much?']")
    public WebElement clickHowMuchButton;

    @FindBy(id = "amount-7-label")
    public WebElement select$500;

    @FindBy(xpath = "//button[.='Add a message']")
    public WebElement addMessage;

    @FindBy(id = "message-input")
    public WebElement writeTheMessage;

    @FindBy(id = "recipientEmail-input" )
    public WebElement writeEmailAddress;

    @FindBy(id = "recipientEmailConfirmation-input")
    public WebElement conformEmailAddress;

    @FindBy(xpath = "//button[.='Add to cart']")
    public WebElement addToCart;

    @FindBy(xpath = "//button[.='Send A Physical Card']")
    public WebElement selectPhysicalCard;

    @FindBy(id = "amount-4")
    public WebElement select$250;

    @FindBy(id = "amount-8-label")
    public WebElement select$750;

    @FindBy(id = "selectedGroupOrdinal-0-label")
    public WebElement selectWeddingDesign;

    @FindBy(xpath = "//div[@class='panel panel-default inspiration-sub-nav']")
    public WebElement selectGiftCardButton;

    @FindBy(xpath = "//a[@href='/us/en/gift-cards/faqs']")
    public WebElement selectFrequentlyAskedQuestion;

    @FindBy(xpath = "//a[@href='/us/en/gift-cards/purchase']")
    public WebElement selectBuyIndividualCards;
}
