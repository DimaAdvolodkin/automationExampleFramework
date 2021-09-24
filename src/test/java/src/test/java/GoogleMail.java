package src.test.java;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleMail {

    SuiteSetUp suite = new SuiteSetUp();
    WebDriver driver;

    By gmailButton = By.xpath("//div[@class='o3j99 LLD4me yr19Zb LS8OJ']");
    By signInButton = By.xpath("//a[normalize-space()='Sign in']");
    By emailUserName = By.name("identifier");
    By nextButton = By.xpath("//span[normalize-space()='Next']");

    @Test
    public void verifyGoogleMail() {
        driver = suite.setDriver();
        driver.get("http://www.google.com");
        driver.findElement(gmailButton).click();
        driver.findElement(signInButton).click();
        driver.findElement(emailUserName).sendKeys("bobak.samiyi@gmail.com");
        driver.findElement(nextButton).click();
    }


}