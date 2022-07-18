package com.Delta.Pages;

import com.Delta.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HowToCancelFlight {

    public HowToCancelFlight() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

//    @FindBy(xpath = "//a[@href='/us/en/travel-planning-center/travel-planning-overview']")
//    public WebElement howToCancel;
    @FindBy(xpath = "//div[@class='cardb parbase'][2]")
    public WebElement howToCancel;

    @FindBy(xpath = "//button[@class='cookie-close-icon float-right circle-outline']")
    public WebElement cookieButton;

    @FindBy(xpath = "//a[@href='#infocollapseInner3']")
    public WebElement clickCancel;

    @FindBy(xpath = "//a[@href='/us/en/travel-planning-center/change-or-cancel-your-trip/how-to-cancel-or-change-your-flight']")
    public WebElement clickCancel2;

    @FindBy(xpath = "//video[@poster='//content.delta.com/content/www/us/en/travel-planning-center/change-or-cancel-your-trip/how-to-cancel-or-change-your-flight.damAssetRender.20201103T2057205300500.html/content/dam/videos/cancel-or-change-flights/cancel-change-1.jpg']")
    public WebElement video1;

    @FindBy(xpath = "//source[@src='//content.delta.com/content/dam/videos/cancel-or-change-flights/Cancel%20or%20Change%20-%201%20-%20Find%20Confirmation%20Number.mp4']")
    public WebElement video;

    @FindBy(xpath = "//source[@src='//content.delta.com/content/dam/videos/cancel-or-change-flights/Cancel%20or%20Change%20-%202%20-%20Find%20Your%20Trip.mp4']")
    public WebElement video2;

    @FindBy(xpath = "//source[@src='//content.delta.com/content/dam/videos/cancel-or-change-flights/step-3-change-a-flight-how-to-cancel-or-change.mp4']")
    public WebElement video3;

}
