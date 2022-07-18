package com.Delta.Sprint3TeamA;

import com.Delta.Pages.HowToCancelFlight;
import com.Delta.Pages.VacPackageDeals;
import com.Delta.Utilities.ConfigReader;
import com.Delta.Utilities.Driver;
import com.Delta.Utilities.SeleniumUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class LyleSprint3 extends BaseClass3 {

    @Test
    public void clickHowToCancelFlight() {

        HowToCancelFlight howTo = new HowToCancelFlight();
        driver.get(ConfigReader.getProperty("url1"));
        howTo.cookieButton.click();
        SeleniumUtils.scroll(0,1800);
        logger.info("How to Cancel Flight");
        SeleniumUtils.waitFor(2);
        howTo.howToCancel.click();
        logger.info("Change or Cancel Trip");
        howTo.clickCancel.click();
        logger.info("How to Change Flight");
        howTo.clickCancel2.click();
        SeleniumUtils.scroll(0,1000);

    }
    @Test
    public void changeOrCancel(){

        HowToCancelFlight howTo = new HowToCancelFlight();
        driver.get(ConfigReader.getProperty("url1"));
        howTo.cookieButton.click();
        SeleniumUtils.scroll(0,1800);
        logger.info("How to Cancel Flight");
        SeleniumUtils.waitFor(2);
        howTo.howToCancel.click();
        logger.info("Change or Cancel Trip");
        howTo.clickCancel.click();
        logger.info("How to Change Flight");
        howTo.clickCancel2.click();
    }
    @Test
    public void clickVideos(){

        HowToCancelFlight howTo = new HowToCancelFlight();
        driver.get(ConfigReader.getProperty("url1"));
        howTo.cookieButton.click();
        SeleniumUtils.scroll(0,1800);
        logger.info("How to Cancel Flight");
        SeleniumUtils.waitFor(2);
        howTo.howToCancel.click();
        logger.info("Change or Cancel Trip");
        howTo.clickCancel.click();
        logger.info("How to Change Flight");
        howTo.clickCancel2.click();
        SeleniumUtils.scroll(0,1000);
        SeleniumUtils.jsClick(howTo.video);
        SeleniumUtils.waitFor(1);
        SeleniumUtils.jsClick(howTo.video1);
        SeleniumUtils.scroll(1000,1000);
        SeleniumUtils.jsClick(howTo.video2);
        SeleniumUtils.scroll(1000,1000);
        SeleniumUtils.jsClick(howTo.video3);



    }
}
