package com.Delta.Sprint3TeamA;

import com.Delta.Pages.HomePageRentACar;
import com.Delta.Pages.PickUpPageRentACar;
import com.Delta.Pages.ShopHotelsAsif;
import com.Delta.Utilities.CSVReader;
import com.Delta.Utilities.ConfigReader;
import com.Delta.Utilities.Driver;
import com.Delta.Utilities.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.swing.text.Utilities;

public class AsifSprint3 extends BaseClass3{

    @Test (groups = "smoke")

    public void SelectARoomInHotel() {

        ShopHotelsAsif hotels = new ShopHotelsAsif();

        Driver.getDriver().get(ConfigReader.getProperty("url1"));
        SeleniumUtils.scroll(0, 300);
        logger.info("click on shop hotels button");
        SeleniumUtils.jsClick(hotels.clickOnShopHotels);
        SeleniumUtils.switchToWindow("Delta - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations");
        SeleniumUtils.jsClick(hotels.clickOnCookies);
        logger.info("click on pick up destination");
        SeleniumUtils.jsClick(hotels.clickOnPickUpDestination);
        logger.info("enter hotel location");
        hotels.EnterHotelLocation();
        logger.info("click on Miami");
        hotels.clickOnMiami();
        logger.info("click on check in");
        SeleniumUtils.jsClick(hotels.clickOnCheckIn);
        SeleniumUtils.jsClick(hotels.clickOnFirstDate);
        logger.info("choose check in date");
        hotels.clickOnFirstDate();
        SeleniumUtils.jsClick(hotels.clickOnCheckOut);
        logger.info("click on check out date");
        SeleniumUtils.jsClick(hotels.clickOnLastDate);
        hotels.clickOnLastDate();
        logger.info("click on rooms");
        hotels.clickOnRooms();
        logger.info("click on child");
        hotels.clickOnChild();
        logger.info("click on child age");
        hotels.clickOnChildAge();
        logger.info("click on search button");
        SeleniumUtils.jsClick(hotels.clickOnSearchHotels);

    }

    @Test (groups = "smoke")

    public void SelectAAdditionalOptions() {

        ShopHotelsAsif hotels = new ShopHotelsAsif();

        Driver.getDriver().get(ConfigReader.getProperty("url1"));
        SeleniumUtils.scroll(0, 300);
        logger.info("click on shop hotels button");
        SeleniumUtils.jsClick(hotels.clickOnShopHotels);
        SeleniumUtils.switchToWindow("Delta - Deals & Discounts for Hotel Reservations from Luxury Hotels to Budget Accommodations");
        SeleniumUtils.jsClick(hotels.clickOnCookies);
        logger.info("click on pick up destination");
        SeleniumUtils.jsClick(hotels.clickOnPickUpDestination);
        logger.info("enter hotel location");
        hotels.EnterHotelLocation();
        logger.info("click on Miami");
        hotels.clickOnMiami();
        logger.info("click on check in");
        SeleniumUtils.jsClick(hotels.clickOnCheckIn);
        SeleniumUtils.jsClick(hotels.clickOnFirstDate);
        logger.info("choose check in date");
        hotels.clickOnFirstDate();
        SeleniumUtils.jsClick(hotels.clickOnCheckOut);
        logger.info("click on check out date");
        SeleniumUtils.jsClick(hotels.clickOnLastDate);
        hotels.clickOnLastDate();
        logger.info("click on rooms");
        hotels.clickOnRooms();
        logger.info("click on child");
        hotels.clickOnChild();
        logger.info("click on child age");
        hotels.clickOnChildAge();
        logger.info("click on search button");
        SeleniumUtils.jsClick(hotels.clickOnSearchHotels);


        logger.info("click on wi-fi");
        hotels.clickOnWiFiIncluded();
        logger.info("click on parking");
        hotels.clickOnParking();
        logger.info("click on price");
        SeleniumUtils.jsClick(hotels.clickOnPrice);
        SeleniumUtils.jsClick(hotels.clickOnLowToHigh);

    }

    @Test(dataProvider = "getData")

    public void clickOnUserAndPassword(String  username,String lastname, String password){

        ShopHotelsAsif hotels = new ShopHotelsAsif();

        Driver.getDriver().get(ConfigReader.getProperty("url1"));
        SeleniumUtils.jsClick(hotels.clickOnLogIn);
        Driver.getDriver().findElement(By.xpath("//input[@id='userId']")).sendKeys(username, Keys.TAB,lastname, Keys.TAB, password, Keys.ENTER);
//        hotels.assertion();

    }

    @DataProvider

    public Object[][]  getData(){

        return CSVReader.readFromCSV("src/test/java/MOCK_DATA.csv");

        };


    }




