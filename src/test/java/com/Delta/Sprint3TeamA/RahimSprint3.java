package com.Delta.Sprint3TeamA;

import com.Delta.Pages.Rahims_Travel_Info_Pages;
import com.Delta.Utilities.ConfigReader;
import com.Delta.Utilities.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class RahimSprint3 extends BaseClass3{
    @Test(groups={"smoke"})
    public void needHelpInfo() {

        driver.get(ConfigReader.getProperty("url1"));
        Rahims_Travel_Info_Pages rrPages = new Rahims_Travel_Info_Pages();
        Rahims_Travel_Info_Pages.explicitNeedInfo(); //explicit wait
        WebElement needHelp = rrPages.travelInfoButton;
        WebElement baggageHelp = rrPages.selectBaggageHelp;

        Actions actions = new Actions(driver); //
        actions.moveToElement(needHelp).build().perform();
        logger.info("Click on Baggage Help");
        baggageHelp.click();
        SoftAssert softAssertion= new SoftAssert(); //
        String actualGarbagePage = "Baggage Policy and Fees";
        softAssertion.assertTrue(driver.getTitle().contains(actualGarbagePage));

    }
    @Test (groups={"smoke"})
    public void fillFormPositive() {
        driver.get(ConfigReader.getProperty("url1"));
        Rahims_Travel_Info_Pages rrPages = new Rahims_Travel_Info_Pages();
        Rahims_Travel_Info_Pages.explicitNeedInfo(); //explicit wait
        WebElement needHelp = rrPages.travelInfoButton;
        WebElement baggageHelp = rrPages.selectBaggageHelp;

        Actions actions = new Actions(driver); //
        actions.moveToElement(needHelp).build().perform();
        logger.info("Click on Baggage Help");
        baggageHelp.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2300)", "");


        driver.findElement(By.xpath("//input[@aria-label='Origin']")).sendKeys("LAX");
        driver.findElement(By.xpath("//input[@aria-label='Destination']")).sendKeys("IAD");

        js.executeScript("window.scrollBy(0,200)", "");
        logger.info("Click on Onboard Experience");
        driver.findElement(By.xpath("//div[@id='idp-input_onboard_experience__selected']")).click();
        //new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@data-label='Main Cabin']")));
        SeleniumUtils.waitForVisibility(By.xpath("//li[@data-label='Main Cabin']"),3);
        logger.info("Click on Main Cabin");
        WebElement element = driver.findElement(By.xpath("//li[@data-label='Main Cabin']"));
        element.click();

        //driver.findElement(By.xpath("//li[@data-label='Main Cabin']")).click();

        logger.info("Click on specific purchase date ");
        driver.findElement(By.xpath("//div[@aria-describedby='idp-input_date_purchase__selected']")).click(); //Purchase Date
        driver.findElement(By.xpath("//div[@data-calendar-date='7/19/2022']")).click();
        driver.findElement(By.xpath("//button[@class='calendar__footer-btn-done']")).click();

        logger.info("Click on specific travel date ");
        driver.findElement(By.xpath("//div[@aria-describedby='idp-input_date_travel__selected']")).click();
        driver.findElement(By.xpath("(//div[@data-calendar-date='7/21/2022'])[2]")).click();
        driver.findElement(By.xpath("(//button[@class='calendar__footer-btn-done'])[2]")).click(); //Travel date

        logger.info("Click on 2 passengers ");
        driver.findElement(By.xpath("//div[@aria-describedby='idp-passengers__selected']")).click();
        driver.findElement(By.xpath("//li[@id='passengersoption-2']")).click();

        logger.info("Click on General SkyMiles Member ");
        driver.findElement(By.xpath("//div[@aria-describedby='idp-medallion-status__selected']")).click();
        driver.findElement(By.xpath("//li[@id='medallion-statusoption-2']")).click();

        logger.info("Click on Gold Card ");
        driver.findElement(By.xpath("//div[@aria-describedby='idp-credit-card-status__selected']")).click();
        driver.findElement(By.xpath("//li[@id='credit-card-statusoption-3']")).click();

        logger.info("Click on Calculate Estimate ");
        driver.findElement(By.xpath("//button[text()='Calculate Estimate']")).click();















    }

    @Test (groups={"smoke"})
    public void fillFormNegative() {
            driver.get(ConfigReader.getProperty("url1"));
            Rahims_Travel_Info_Pages rrPages = new Rahims_Travel_Info_Pages();
            Rahims_Travel_Info_Pages.explicitNeedInfo(); //explicit wait
            WebElement needHelp = rrPages.travelInfoButton;
            WebElement baggageHelp = rrPages.selectBaggageHelp;

            Actions actions = new Actions(driver); //
            actions.moveToElement(needHelp).build().perform();
            logger.info("Click on Baggage Help ");
            baggageHelp.click();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,2300)", "");

            driver.findElement(By.xpath("//input[@aria-label='Origin']")).sendKeys("LAX");
            driver.findElement(By.xpath("//input[@aria-label='Destination']")).sendKeys("IADF");

            js.executeScript("window.scrollBy(0,200)", "");
            logger.info("Click on Onboard Experience");
            driver.findElement(By.xpath("//div[@id='idp-input_onboard_experience__selected']")).click();

            //new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@data-label='Main Cabin']")));
            logger.info("Click on Main Cabin");
            WebElement element = driver.findElement(By.xpath("//li[@data-label='Main Cabin']"));
            element.click();

            //driver.findElement(By.xpath("//li[@data-label='Main Cabin']")).click();
            logger.info("Click on specific purchase date ");
            driver.findElement(By.xpath("//div[@aria-describedby='idp-input_date_purchase__selected']")).click(); //Purchase Date
            driver.findElement(By.xpath("//div[@data-calendar-date='7/19/2022']")).click();
            driver.findElement(By.xpath("//button[@class='calendar__footer-btn-done']")).click();

            logger.info("Click on specific travel date ");
            driver.findElement(By.xpath("//div[@aria-describedby='idp-input_date_travel__selected']")).click();
            driver.findElement(By.xpath("(//div[@data-calendar-date='7/21/2022'])[2]")).click();
            driver.findElement(By.xpath("(//button[@class='calendar__footer-btn-done'])[2]")).click(); //Travel date

            logger.info("Click on 1 passengers ");
            driver.findElement(By.xpath("//div[@aria-describedby='idp-passengers__selected']")).click();
            driver.findElement(By.xpath("//li[@id='passengersoption-1']")).click();

            logger.info("Click on Gold Medallion ");
            driver.findElement(By.xpath("//div[@aria-describedby='idp-medallion-status__selected']")).click();
            driver.findElement(By.xpath("//li[@id='medallion-statusoption-4']")).click();

            logger.info("Click on Blue Card ");
            driver.findElement(By.xpath("//div[@aria-describedby='idp-credit-card-status__selected']")).click();
            driver.findElement(By.xpath("//li[@id='credit-card-statusoption-2']")).click();

            logger.info("Click on Calculate Estimate ");
            driver.findElement(By.xpath("//button[text()='Calculate Estimate']")).click();

        logger.info("Check for error message");
        SoftAssert softAssertion= new SoftAssert(); //
        String actualErrorMessage = "Uh-oh! We're sorry, but our services are down at this time. Please try again later.";
        softAssertion.assertEquals(driver.findElement(By.xpath("//span[contains(text(),\"We're sorry, but our services are down at this time\")]")),actualErrorMessage);



















    }

}
