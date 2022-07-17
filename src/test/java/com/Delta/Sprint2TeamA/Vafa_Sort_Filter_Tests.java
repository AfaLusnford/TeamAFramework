package com.Delta.Sprint2TeamA;

import com.Delta.Pages.SortAndFilterPage;
import com.Delta.Utilities.ConfigReader;
import com.Delta.Utilities.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

public class Vafa_Sort_Filter_Tests extends BaseClass2 {

    @Test
    public void SortAndFilterFlights1(){
        driver.get(ConfigReader.getProperty("url1"));
        SortAndFilterPage sfp = new SortAndFilterPage();
//        SeleniumUtils.jsClick(sfp.clickOnSubmit);
        sfp.clickOnSortAndFilter.click();
        sfp.clickOnBestMatch.click();
        sfp.clickOnPrice.click();
        sfp.DeselectMultistop.click();
    }


    @Test
    public void SortAndFilterFlights2(){
        driver.get(ConfigReader.getProperty("url1"));
        SortAndFilterPage sfp = new SortAndFilterPage();
        sfp.ClickOnConnectionTime.sendKeys(Keys.ARROW_LEFT, Keys.ARROW_LEFT);
        List <WebElement> airports = driver.findElements(By.xpath("//div[@class='mb-3 col-sm-12 col-lg-4 col-md-4 p-0 d-flex flex-row ng-star-inserted']"));
        for (WebElement airport: airports) {
           if(airport.isSelected()){
               SeleniumUtils.jsClick(airport);
           }
           sfp.ClickOnLAX.click();
        }
    }


    @Test
    public void SortAndFilterFlights3() {
        driver.get(ConfigReader.getProperty("url1"));
        SortAndFilterPage sfp = new SortAndFilterPage();

        sfp.ClickOnConnectionTime.sendKeys(Keys.ARROW_LEFT, Keys.ARROW_LEFT, Keys.ARROW_LEFT);
        List<WebElement> airports = driver.findElements(By.xpath("//div[@class='mb-3 col-sm-12 col-lg-4 col-md-4 p-0 d-flex flex-row ng-star-inserted']"));
        for (WebElement airport : airports) {
            if (airport.isSelected()) {
                SeleniumUtils.jsClick(airport);
            }
            sfp.ClickOnDTW.click();
            sfp.ClickOnSEA.click();
        }
    }

    @Test
    public void SortAndFilterFlights4() {
        driver.get(ConfigReader.getProperty("url1"));
        SortAndFilterPage sfp = new SortAndFilterPage();

         sfp.clickOnSortAndFilter.click();
         sfp.ClickOnTravelTime.click();
         sfp.DeselectMultistop.click();
        }
    }
