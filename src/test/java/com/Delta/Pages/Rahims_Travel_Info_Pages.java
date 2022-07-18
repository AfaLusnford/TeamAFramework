package com.Delta.Pages;

import com.Delta.Sprint3TeamA.BaseClass3;
import com.Delta.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Rahims_Travel_Info_Pages {

        public Rahims_Travel_Info_Pages(){
            PageFactory.initElements(Driver.getDriver(),this);

        }

        @FindBy(xpath = "//ul[@class='navbar-nav nav-primary nav']//li[8]")
        public WebElement travelInfoButton;

        @FindBy(xpath = "//ul[@class='list-unstyled m-lg-0']//li[4]")
        public WebElement selectBaggageHelp;

        @FindBy(xpath = "//input[@aria-label='Last Name']")
        public WebElement SelectOnLastNameBox;


        public static void explicitNeedInfo(){
                new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(6)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@class='navbar-nav nav-primary nav']//li[8]")));
        }
}
