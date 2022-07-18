package com.Delta.Sprint3TeamA;

import com.Delta.Pages.ShopHotelsAsif;
import com.Delta.Utilities.CSVReader;
import com.Delta.Utilities.ConfigReader;
import com.Delta.Utilities.Driver;
import com.Delta.Utilities.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AsifSprint3DataProvider extends BaseClass3{
    @Test(dataProvider = "getData")
    public void clickOnUserAndPassword(String username,String lastname, String password){

        ShopHotelsAsif hotels = new ShopHotelsAsif();

        Driver.getDriver().get(ConfigReader.getProperty("url1"));
        SeleniumUtils.jsClick(hotels.clickOnLogIn);
        Driver.getDriver().findElement(By.xpath("//input[@id='userId']")).sendKeys(username, Keys.TAB,lastname, Keys.TAB, password, Keys.ENTER);
//        hotels.assertion();

    }

    @DataProvider(name = "getData", parallel = true)
    public Object[][] getData(){

        return CSVReader.readFromCSV("src/test/java/MOCK_DATA.csv");

    }
}
