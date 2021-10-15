package src.test.java.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import src.test.java.helperMethods.SuiteSetUp;

public class googleSearch {

    SuiteSetUp suite = new SuiteSetUp();
    WebDriver driver;

    By searchInput = By.name("q");
    By searchButton = By.xpath("//div[@jsname='VlcLAe']//input[@name='btnK']");
    By adelleSongLinkText = By.linkText("Adele - Hello - YouTube");

    @Test
    public void verifyGoogleSearch() {
        driver = suite.setDriver();
        driver.get("http://www.google.com");
        driver.findElement(searchInput).sendKeys("Hello");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        driver.findElement(searchButton).click();
        Assert.assertTrue("Failed search on google", driver.findElement(adelleSongLinkText).isDisplayed());
    }
}
