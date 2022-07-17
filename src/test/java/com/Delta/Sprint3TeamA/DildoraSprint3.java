package com.Delta.Sprint3TeamA;

import com.Delta.Pages.Dildora_GiftCard_Page;
import com.Delta.Utilities.ConfigReader;
import com.Delta.Utilities.SeleniumUtils;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class DildoraSprint3 extends BaseClass3 {
    @Test
    public void digitalGiftCard(){
        driver.get(ConfigReader.getProperty("url1"));
        SeleniumUtils.scroll(0,400);
        Dildora_GiftCard_Page dildora_giftCard_page = new Dildora_GiftCard_Page();
        logger.info("Click on Gift Card.");
        dildora_giftCard_page.ClickGiftCard.click();
        SeleniumUtils.waitForPageToLoad(3);
        SeleniumUtils.scroll(0,400);
        logger.info(" Click Buy Gift Card");
        dildora_giftCard_page.buyGiftCard.click();
        SeleniumUtils.waitForPageToLoad(3);
        Faker faker = new Faker();
        logger.info("write Their fullName ");
        dildora_giftCard_page.putTheirName.sendKeys(faker.name().fullName());
        dildora_giftCard_page.putYourName.sendKeys(faker.name().fullName() + Keys.ENTER);
        logger.info("Select digital card");
        dildora_giftCard_page.selectDigitalCard.click();
        dildora_giftCard_page.selectHappyBirthdayDesign.click();
        SeleniumUtils.scroll(0,400);
        dildora_giftCard_page.clickHowMuchButton.click();
        dildora_giftCard_page.select$500.click();
        SeleniumUtils.scroll(0,300);
        dildora_giftCard_page.addMessage.click();
        logger.info("Write the message");
        dildora_giftCard_page.writeTheMessage.sendKeys(faker.shakespeare().romeoAndJulietQuote());
        driver.findElement(By.xpath("//button[.='Where is it going?']")).click(); //whereIsGoing
        String email = faker.internet().emailAddress();
        dildora_giftCard_page.writeEmailAddress.sendKeys(email);
        dildora_giftCard_page.conformEmailAddress.sendKeys(email);
        SeleniumUtils.scroll(0,300);
        SeleniumUtils.waitFor(3);
        logger.info("Add to cart");
        dildora_giftCard_page.addToCart.click();
        SeleniumUtils.getScreenshot("DigitalGiftCart");

    }







    @Test(groups = {"smoke"})
    public void physicalGiftCard(){
        driver.get(ConfigReader.getProperty("url1"));
        SeleniumUtils.scroll(0,400);
        Dildora_GiftCard_Page dildora_giftCard_page = new Dildora_GiftCard_Page();
        logger.info("Click on Gift Card.");
        dildora_giftCard_page.ClickGiftCard.click();
        SeleniumUtils.waitForPageToLoad(3);
        SeleniumUtils.scroll(0,400);
        logger.info("Select buy gift card");
        dildora_giftCard_page.buyGiftCard.click();
        SeleniumUtils.waitForPageToLoad(3);
        Faker faker = new Faker();
        dildora_giftCard_page.putTheirName.sendKeys(faker.name().fullName());
        dildora_giftCard_page.putYourName.sendKeys(faker.name().fullName() + Keys.ENTER);
        SeleniumUtils.scroll(0,300);
        dildora_giftCard_page.selectPhysicalCard.click();
        logger.info("Click on How much button");
        dildora_giftCard_page.clickHowMuchButton.click();
        dildora_giftCard_page.select$250.click();
        dildora_giftCard_page.addMessage.click();
        logger.info("Write the message");
        dildora_giftCard_page.writeTheMessage.sendKeys("Hello world");
        driver.findElement(By.xpath("//button[.='Where is it going?']")).click(); //whereIsGoing
    }

    @Test
    public void digitalWeddingGiftCard(){
        driver.get(ConfigReader.getProperty("url1"));
        SeleniumUtils.scroll(0,400);
        Dildora_GiftCard_Page dildora_giftCard_page = new Dildora_GiftCard_Page();
        logger.info("Click on Gift Card.");
        dildora_giftCard_page.ClickGiftCard.click();
        SeleniumUtils.waitForPageToLoad(3);
        SeleniumUtils.scroll(0,400);
        dildora_giftCard_page.selectGiftCardButton.click();
        logger.info("Select frequently asked questions");
        dildora_giftCard_page.selectFrequentlyAskedQuestion.click();
        dildora_giftCard_page.selectBuyIndividualCards.click();
        SeleniumUtils.waitForPageToLoad(3);
        Faker faker = new Faker();
        logger.info("write their name");
        dildora_giftCard_page.putTheirName.sendKeys(faker.name().fullName());
        dildora_giftCard_page.putYourName.sendKeys(faker.name().fullName() + Keys.ENTER);
        dildora_giftCard_page.selectDigitalCard.click();
        logger.info(" Select Wedding Design");
        dildora_giftCard_page.selectWeddingDesign.click();
        SeleniumUtils.scroll(0,400);
        dildora_giftCard_page.clickHowMuchButton.click();
        logger.info("Select $750");
        dildora_giftCard_page.select$750.click();
        SeleniumUtils.scroll(0,300);
        logger.info("Add the message");
        dildora_giftCard_page.addMessage.click();
        dildora_giftCard_page.writeTheMessage.sendKeys("Hello world");
        driver.findElement(By.xpath("//button[.='Where is it going?']")).click(); //whereIsGoing
        String email = faker.internet().emailAddress();
        logger.info("Write email address");
        dildora_giftCard_page.writeEmailAddress.sendKeys(email);
        dildora_giftCard_page.conformEmailAddress.sendKeys(email);
        SeleniumUtils.scroll(0,300);
        SeleniumUtils.waitFor(3);
        logger.info("Add to cart");
        dildora_giftCard_page.addToCart.click();
        SeleniumUtils.getScreenshot("DigitalWeddingGiftCart");

    }

}
