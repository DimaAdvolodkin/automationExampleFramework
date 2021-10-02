package src.test.java;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchHi {

    SuiteSetUp suite = new SuiteSetUp();
    WebDriver driver;


    By searchInput = By.name("q");
    By searchButton = By.xpath("//div[@jsname='VlcLAe']//input[@name='btnK']");
    By hiLinkText = By.linkText("LOVELYZ \"안녕(Hi~)\" Official MV - YouTube");



    @Test
    public void verifyGoogleHiSearch() {
        driver = suite.setDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        driver.findElement(searchInput).sendKeys("hi");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        driver.findElement(searchButton).click();
        Assert.assertTrue("Failed search on google", driver.findElement(hiLinkText).isDisplayed());
    }



}
