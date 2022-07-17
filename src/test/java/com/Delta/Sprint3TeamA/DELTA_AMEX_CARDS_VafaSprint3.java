package com.Delta.Sprint3TeamA;

import com.Delta.Pages.Homepage_Vafa;
import com.Delta.Pages.Vafa_Booking_Page;
import com.Delta.Utilities.ConfigReader;
import com.Delta.Utilities.SeleniumUtils;
import org.testng.annotations.Test;

public class DELTA_AMEX_CARDS_VafaSprint3 extends BaseClass3 {


    @Test
    public void applyBusinessDeltaSkyPlatinum() {

        Homepage_Vafa hv = new Homepage_Vafa();
        driver.get(ConfigReader.getProperty("url1"));
        logger.info("Click on AMEX Cards");
        SeleniumUtils.jsClick(hv.clickOnAMEXCards);
        SeleniumUtils.waitFor(3);
        logger.info("Switch to the next window");
        SeleniumUtils.switchToWindow("AMEX Delta Co-Brand");
        SeleniumUtils.scroll(500, 2500);
        logger.info("Click on Business button");
        SeleniumUtils.jsClick(hv.clickOnBusiness);
        SeleniumUtils.scroll(500, 2500);
        logger.info("Click on Over 100K");
        SeleniumUtils.jsClick(hv.clickOnOver100K);
        SeleniumUtils.scroll(500, 2500);
        logger.info("Click on Over 5 Times Per Year");
        SeleniumUtils.jsClick(hv.clickOnOver5TimesPerYear);
        SeleniumUtils.scroll(500, 2500);
        logger.info("Click on Status Is Important");
        SeleniumUtils.jsClick(hv.clickOnStatusIsImportant);
        logger.info("Click on See Full Benefits");
        SeleniumUtils.jsClick(hv.clickOnSeeFullBenefits);
        SeleniumUtils.scroll(500, 1500);
        logger.info("Click on Sky Miles Platinum");
        SeleniumUtils.jsClick(hv.clickOnSkyMilesPlatinum);
        logger.info("Click on Benefit Terms");
        SeleniumUtils.jsClick(hv.clickOnBenefitTerms);
        logger.info("Click on Rates and Fees");
        SeleniumUtils.jsClick(hv.clickOnRatesAndFees);
        logger.info("Click on Apply Platinum");
        SeleniumUtils.jsClick(hv.clickOnApplyPlatinum);
    }


    @Test
    public void applyPersonalDeltaSkyPlatinum() {

        Homepage_Vafa hv = new Homepage_Vafa();
        driver.get(ConfigReader.getProperty("url1"));
        logger.info("Click on AMEX Cards");
        SeleniumUtils.jsClick(hv.clickOnAMEXCards);
        SeleniumUtils.waitFor(3);
        logger.info("Switch to the next window");
        SeleniumUtils.switchToWindow("AMEX Delta Co-Brand");
        logger.info("Click on Personal");
        SeleniumUtils.jsClick(hv.clickOnPersonal);
        SeleniumUtils.scroll(500, 2500);
        logger.info("Click on 2X Per Year");
        SeleniumUtils.jsClick(hv.clickOn2PerYear);
        logger.info("Click on First Class");
        SeleniumUtils.jsClick(hv.clickOnFirstClass);
        SeleniumUtils.scroll(500, 2500);
        logger.info("Click on Priority");
        SeleniumUtils.jsClick(hv.clickOnPriority);
        SeleniumUtils.scroll(500, 2500);
        logger.info("Click on See Full Benefits");
        SeleniumUtils.jsClick(hv.clickOnSeeFullBenefits);
        logger.info("Click on Apply Platinum");
        SeleniumUtils.jsClick(hv.clickOnApplyPlatinum);
    }


    @Test
    public void seeFullBenefitsOfDeltaSkyPlatinumBusinessCard() {

        Homepage_Vafa hv = new Homepage_Vafa();
        driver.get(ConfigReader.getProperty("url1"));
        logger.info("Click on AMEX Cards");
        SeleniumUtils.jsClick(hv.clickOnAMEXCards);
        SeleniumUtils.waitFor(3);
        logger.info("Switch to the next window");
        SeleniumUtils.switchToWindow("AMEX Delta Co-Brand");
        SeleniumUtils.scroll(500, 3500);
        logger.info("Select Business Cards");
        SeleniumUtils.jsClick(hv.selectBusinessCards);
        logger.info("Click on Offer Terms");
        SeleniumUtils.jsClick(hv.clickOnOfferTerms);
        logger.info("Click on Rates and Fees");
        SeleniumUtils.jsClick(hv.clickOnRatesAndFees);
        logger.info("Click on Benefit Terms");
        SeleniumUtils.jsClick(hv.clickOnBenefitTerms);
        logger.info("Switch to the previous window");
        SeleniumUtils.switchToWindow("AMEX Delta Co-Brand");
    }

}
