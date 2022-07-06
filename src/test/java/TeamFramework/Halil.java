package TeamFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Halil extends BaseClass {


    @Test(priority=2)
    public void getDestination(){

        //driver.get("https://www.delta.com/");
        driver.findElement(By.id("headPrimary1")).click();
        driver.findElement(By.xpath("//span[.='From']")) .click();
        driver.findElement(By.id("search_input")).sendKeys("LGA", Keys.ENTER);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='arrivalCity']")));
        driver.findElement(By.xpath("//input[@aria-invalid='false']")).sendKeys("BUR", Keys.ENTER);
    }
    @Test(priority=3)
    public void oneWayAndRoundTrip(){

        //driver.get("https://www.delta.com/");
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.id("selectTripType-val")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.id("ui-list-selectTripType1")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.id("input_departureDate_1")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[@aria-label='13 July 2022, Wednesday']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//button[.='done']")));
    }

    @Test(priority=4)
    public void passengers(){
        //driver.get("https://www.delta.com/");
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.id("passengers-val")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.id("ui-list-passengers0")));



    }
    @Test(priority=5)
    public void submit(){
       // driver.get("https://www.delta.com/");
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.id("btn-book-submit")));

    }

}



