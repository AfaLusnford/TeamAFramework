package com.Delta.Pages;

import com.Delta.Utilities.CSVReader;
import com.Delta.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ShopHotelsAsif {

    public ShopHotelsAsif(){

        PageFactory.initElements(Driver.getDriver(),this);//to call all @FindBy elements, must be added to Page Package

    }

    @FindBy(xpath = "//a[@data-analytics-id='home-shop-2']")
    public WebElement clickOnShopHotels;

    @FindBy(xpath = "//button[@class='osano-cm-accept osano-cm-buttons__button osano-cm-button osano-cm-button--type_accept']")
    public WebElement clickOnCookies;

    @FindBy(xpath = " //input[@name='q-destination']")
    public WebElement clickOnPickUpDestination;

    public void EnterHotelLocation(){

        Driver.getDriver().findElement(By.xpath(" //input[@name='q-destination']")).sendKeys("MIA");
    }

    public void clickOnMiami(){

        Actions action = new Actions(Driver.getDriver());
        WebElement element = Driver.getDriver().findElement(By.id("citysqm-asi0-s1"));
        action.moveToElement(element).click().perform();
    }

    @FindBy(xpath = " //input[@class='query-localised-check-in ']")
    public WebElement clickOnCheckIn;

    public void clickOnFirstDate(){

        Driver.getDriver().findElement(By.xpath("//td[@data-date='2022-6-25']")).click();
    }

    @FindBy(xpath = " //td[@data-date='2022-6-25']")
    public WebElement clickOnFirstDate;

    @FindBy(id = "qf-0q-localised-check-out")
    public WebElement clickOnCheckOut;

    public void clickOnLastDate(){

        Driver.getDriver().findElement(By.xpath("//td[@data-date='2022-6-30']")).click();
    }

    @FindBy(xpath = "//td[@data-date='2022-6-30']")
    public WebElement clickOnLastDate;

    public void clickOnRooms(){

        Select select = new Select(Driver.getDriver().findElement(By.id("qf-0q-compact-occupancy")));
        select.selectByVisibleText("More options…");

    }

    public void clickOnChild(){

        Select select = new Select(Driver.getDriver().findElement(By.id("qf-0q-room-0-children")));
        select.selectByValue("1");

    }

    public void clickOnChildAge(){

        Select select = new Select(Driver.getDriver().findElement(By.id("qf-0q-room-0-child-0-age")));
        select.selectByValue("5");

    }

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement clickOnSearchHotels;


    //SECOND TEST CASE



    @FindBy(id = "f-popular-527-3")
    public WebElement clickOnWiFiIncluded;

    public void clickOnWiFiIncluded(){

        Driver.getDriver().findElement(By.xpath("//input[@data-os-filter-val='WiFi included']")).click();
    }

    @FindBy(id = "f-label-popular-134234112-4")
    public WebElement clickOnParking;

    public void clickOnParking(){

        Driver.getDriver().findElement(By.xpath("//input[@data-os-filter-val='Parking']")).click();
    }

//    public void ReduceNightlyPrice(){
//
//        Actions action = new Actions(Driver.getDriver());
//        WebElement element = Driver.getDriver().findElement(By.xpath("//div[@aria-controls='f-price-max']"));
//        action.clickAndHold(element).moveByOffset(-61,0).build().perform();
//    }

    @FindBy(xpath = "//a[@data-menu='sort-submenu-price']")
    public WebElement clickOnPrice;

    @FindBy(xpath = "//a[@data-option-id='opt_PRICE']")
    public WebElement clickOnLowToHigh;

    @FindBy(xpath = "//button[@class='login-btn btn btn-danger']")
    public WebElement clickOnLogIn;


    public void assertion(){


        WebElement errorMessage = Driver.getDriver().findElement(By.xpath("//div[@class='overlayText ng-star-inserted]"));

        Assert.assertTrue(errorMessage.isDisplayed());

//        String errorMessage = Driver.getDriver().findElement(By.xpath("//div[@class='overlayText ng-star-inserted]")).getText();
//        String actual = "Uh-oh! We're sorry, we are unable to process your request. Please try again later.";
//
//        Assert.assertEquals(errorMessage, actual);
    }




}
