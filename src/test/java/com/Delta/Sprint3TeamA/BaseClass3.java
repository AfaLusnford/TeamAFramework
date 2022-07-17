package com.Delta.Sprint3TeamA;

import com.Delta.Utilities.ConfigReader;
import com.Delta.Utilities.Driver;
import com.Delta.Utilities.SeleniumUtils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;
import java.time.Duration;

public class BaseClass3 {


    protected WebDriver driver;
    protected static ExtentReports extentReports;
    protected static ExtentSparkReporter htmlReport;
    protected static ExtentTest logger;
    Faker fake = new Faker();

    @BeforeSuite(alwaysRun = true)
    public void setUpReport(){
        extentReports = new ExtentReports();
        String browser = System.getProperty("browser");
        String name = browser == null ? "" : browser;
        String pathToReportFile =   System.getProperty("user.dir")+"/target/extentReports/"+name+"extendReport.html";
        htmlReport = new ExtentSparkReporter(pathToReportFile);
        extentReports.attachReporter(htmlReport);

        extentReports.setSystemInfo("Name", "Delta Automation Test 3");
        extentReports.setSystemInfo("Browser",browser == null ?  ConfigReader.getProperty("browser"): browser);
        extentReports.setSystemInfo("Environment", "QA");
        extentReports.setSystemInfo("Name", "Team A");
    }

    @BeforeMethod(alwaysRun = true)
    public void setupMethod(Method method) {


        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        logger= extentReports.createTest(method.getName());
    }


    @AfterMethod(alwaysRun = true)
    public void tearDownMethod(ITestResult testResult) {

        if(testResult.getStatus()==ITestResult.SUCCESS){
            logger.pass("Test Passed");
        }else if (testResult.getStatus()==ITestResult.SKIP){
            logger.skip("Test Skipped");
        }else if (testResult.getStatus()==ITestResult.FAILURE){
            logger.fail("Test Failed.");
            logger.fail(testResult.getThrowable());
            String screenshotFilePath= SeleniumUtils.getScreenshot("Failed");
            logger.addScreenCaptureFromPath(screenshotFilePath);
        }

        Driver.quitDriver();

    }
    @AfterSuite(alwaysRun = true)

    public void tearDownReport(){
        extentReports.flush();

    }
}
