package com.Delta.Pages;

import com.Delta.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HalilSprint3Page {

    public HalilSprint3Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//p[.='This June, reinvent how you travel through the Big Apple. We’re excited to share highlights of our all-new LEED Silver certified terminal. Learn more.']")
    public WebElement transformed;

    @FindBy(xpath = "//a[.='Delta Vacations']")
    public WebElement vocations;

    @FindBy(xpath = "//input[@id='origin']")
    public WebElement from;

    @FindBy(xpath = "//input[@id='show-prices']")
    public WebElement pricing;

    @FindBy(name = "pricing")
    public WebElement dollar;

    public void filterPrice(){

        Actions action = new Actions(Driver.getDriver());
        WebElement element = Driver.getDriver().findElement(By.id("slider"));
        action.clickAndHold(element).moveByOffset(60,0).build().perform();
    }

    @FindBy(id= "destination")
    public WebElement to;


    public void selectRegion(){

        Select select = new Select(Driver.getDriver().findElement(By.id("region")));

        select.selectByVisibleText("North America");
    }
    public void travelAvailability(){

        Select select = new Select(Driver.getDriver().findElement(By.id("openness")));

        select.selectByVisibleText("Open with restrictions");
    }
    public void destinationType(){

        Select select = new Select(Driver.getDriver().findElement(By.id("tag")));

        select.selectByVisibleText("Beach");

    }

    @FindBy(xpath = "//span[@class='expandable-options__title']")
    public WebElement showOnly;

    @FindBy(id= "restriction-shops")
    public WebElement nonEssentials;

    @FindBy(id= "restriction-hotels")
    public WebElement hotels;

    @FindBy(id= "restriction-restaurants")
    public WebElement restaurants;

    @FindBy(id= "restriction-bars")
    public WebElement bars;

    @FindBy(id= "restriction-museums")
    public WebElement museums;

    @FindBy(xpath = "//span[.='Exclude Destinations Requiring:']")
    public WebElement exclude;

    @FindBy(id= "restriction-test")
    public WebElement coVid;

    @FindBy(id= "restriction-forms")
    public WebElement forms;

    @FindBy(id= "restriction-forms")
    public WebElement quarantine;

    @FindBy(id= "restriction-masks")
    public WebElement faceCovering;

    @FindBy(id= "restriction-distancing")
    public WebElement socialDistancing;

    @FindBy(id= "restriction-health-insurance")
    public WebElement healthInsurance;








}
