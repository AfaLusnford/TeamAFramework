package com.Delta.Pages;
import com.Delta.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SortAndFilterPage {


    public SortAndFilterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = " //button[@id='btnSubmit']")
    public WebElement clickOnSubmit;

    @FindBy(xpath = "//span[@class='float-left']")
    public WebElement clickOnSortAndFilter;
    @FindBy(xpath = "//span[@title='selected  Best Match']")
    public WebElement clickOnBestMatch;
    @FindBy(xpath = "//li[@id='ui-list-sortby1']")
    public WebElement clickOnPrice;
    @FindBy(xpath = "")
    public WebElement DeselectMultistop;

    @FindBy(xpath = "//div[@style='left: 100%;'][1]")
    public WebElement ClickOnConnectionTime;


    @FindBy(xpath = "//div[@class='mb-3 col-sm-12 col-lg-4 col-md-4 p-0 d-flex flex-row ng-star-inserted']")
    public WebElement ClickOnCheckBoxes;

    @FindBy(xpath = "//label[@for='layoverAirport_3']")
    public WebElement ClickOnLAX;

    @FindBy(xpath = "//div[@aria-valuetext='10200']")
    public WebElement ClickOnTotalPrice;

    @FindBy(xpath = "//label[@for='layoverAirport_5']")
    public WebElement ClickOnSEA;

    @FindBy(xpath = "//label[@for='layoverAirport_2']")
    public WebElement ClickOnDTW;

    @FindBy(xpath = "//li[@id='ui-list-sortby5']")
    public WebElement ClickOnTravelTime;

}