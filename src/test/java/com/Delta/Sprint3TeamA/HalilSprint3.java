package com.Delta.Sprint3TeamA;

import com.Delta.Pages.HalilSprint3Page;
import com.Delta.Utilities.ConfigReader;
import com.Delta.Utilities.SeleniumUtils;
import org.testng.annotations.Test;

public class HalilSprint3 extends BaseClass3 {

    @Test(groups = {"smoke"})
    public void deltaVocations() {
        HalilSprint3Page halilSprint3Page = new HalilSprint3Page();
        logger.info("Initializing the browser. Navigating to a url");
        driver.get(ConfigReader.getProperty("url1"));
        SeleniumUtils.scroll(0, 200);
        logger.info("Clicking on the A TRANSFORMED LGA IS ON THE WAY");
        SeleniumUtils.jsClick(halilSprint3Page.transformed);
        logger.info("Clicking on the Delta Vocations");
        SeleniumUtils.jsClick(halilSprint3Page.vocations);

    }

    @Test(groups = {"smoke"})
    public void beyondSky() {
        HalilSprint3Page halilSprint3Page = new HalilSprint3Page();

        logger.info("Initializing the browser. Navigating to a url");
        driver.get(ConfigReader.getProperty("HalilUrl1"));

        SeleniumUtils.scroll(0, 200);
        logger.info("Clicking on the from ");
        SeleniumUtils.jsClick(halilSprint3Page.from);
        logger.info("Sending the KEY ");
        halilSprint3Page.from.sendKeys("New York-LaGuardia, NY (LGA)");
        logger.info("Clicking on the pricing");
        halilSprint3Page.pricing.click();
        logger.info("Clicking on the USD");
        halilSprint3Page.dollar.click();
        logger.info("Filtering The Price");
        halilSprint3Page.filterPrice();
        logger.info("Sending the KEY ");
        halilSprint3Page.to.sendKeys("Miami, FL (MIA)");
        logger.info("Selecting REGION");
        halilSprint3Page.selectRegion();
        logger.info("Selecting Travel Availability");
        halilSprint3Page.travelAvailability();
        logger.info("Selecting Destination Type");
        halilSprint3Page.destinationType();

    }

    @Test(groups = {"smoke"})
    public void showDestinationsWith() {
        HalilSprint3Page halilSprint3Page = new HalilSprint3Page();
        logger.info("Initializing the browser. Navigating to a url");
        driver.get(ConfigReader.getProperty("HalilUrl1"));
        SeleniumUtils.waitFor(2);
        logger.info("Clicking On The Show Only");
        SeleniumUtils.jsClick(halilSprint3Page.showOnly);
        logger.info("Clicking On The Non Essentials");
        halilSprint3Page.nonEssentials.click();
        logger.info("Clicking On The Hotels");
        halilSprint3Page.hotels.click();
        logger.info("Clicking On The Restaurants");
        halilSprint3Page.restaurants.click();
        logger.info("Clicking On The Bars");
        halilSprint3Page.bars.click();
        logger.info("Clicking On The MUSEUMS");
        halilSprint3Page.museums.click();


    }

    @Test(groups = {"smoke"})
    public void excludeDestinationRequiring() {
        HalilSprint3Page halilSprint3Page = new HalilSprint3Page();
        logger.info("Initializing the browser. Navigating to a url");
        driver.get(ConfigReader.getProperty("HalilUrl1"));
        SeleniumUtils.waitFor(2);
        logger.info("Clicking On The excludes");
        SeleniumUtils.jsClick(halilSprint3Page.exclude);
        logger.info("Clicking On The Covid");
        halilSprint3Page.coVid.click();
        logger.info("Clicking On The Forms");
        halilSprint3Page.forms.click();
        logger.info("Clicking On The Quarantine");
        halilSprint3Page.quarantine.click();
        logger.info("Clicking On The Face Covering");
        halilSprint3Page.faceCovering.click();
        logger.info("Clicking On The Social Distancing");
        halilSprint3Page.socialDistancing.click();
        logger.info("Clicking On The Health Insurance");
        halilSprint3Page.healthInsurance.click();






    }
}