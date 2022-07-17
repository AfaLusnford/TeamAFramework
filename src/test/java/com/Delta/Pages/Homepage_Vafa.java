package com.Delta.Pages;

import com.Delta.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_Vafa {


    public Homepage_Vafa() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@id='amex']")
    public WebElement clickOnAMEXCards;

    @FindBy(xpath = "//label[@id='PQ1-O1']")
    public WebElement clickOnPersonal;

    @FindBy(xpath = "//label[@id='PQ1-O2']")
    public WebElement clickOnBusiness;

    @FindBy(xpath = "//label[@id='BQ1-O3']")
    public WebElement clickOnOver100K;

    @FindBy(xpath = "//label[@id='BQ2-O2']")
    public WebElement clickOnOver5TimesPerYear;

    @FindBy(xpath = "//label[@id='BQ3-O2']")
    public WebElement clickOnStatusIsImportant;

    @FindBy(xpath = "//label[@id='PQ2-O1']")
    public WebElement clickOn2PerYear;

    @FindBy(xpath = "//label[@id='PQ3-O3']")
    public WebElement clickOnFirstClass;

    @FindBy(xpath = "//label[@id='PQ4-O3']")
    public WebElement clickOnPriority;

    @FindBy(xpath = "//a[@class='benefitsLink']")
    public WebElement clickOnSeeFullBenefits;

    @FindBy(xpath = "//a[@class='applynow xsBtn applyPlatinumPersonalSticky']")
    public WebElement clickOnApplyPlatinum;

    @FindBy(xpath = "//a[@class='benefitTerms benefitsPlatinumBusinessSticky']")
    public WebElement clickOnBenefitTerms;

    @FindBy(xpath = "//a[@class='applynow xsBtn applyPlatinumBusinessSticky']")
    public WebElement clickOnSkyMilesPlatinum;

    @FindBy(xpath = "//a[@class='ratesFees ratesPlatinumBusinessSticky']")
    public WebElement clickOnRatesAndFees;

    @FindBy(xpath = "//ul[@class='dropdownUL'][1]")
    public WebElement selectBusinessCards;

    @FindBy(xpath = "//a[@class='offerTerms offersPlatinumBusinessSticky']")
    public WebElement clickOnOfferTerms;

}
