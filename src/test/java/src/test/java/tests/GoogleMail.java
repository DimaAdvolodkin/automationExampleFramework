package src.test.java.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import src.test.java.helperMethods.SuiteSetUp;

public class GoogleMail {

    SuiteSetUp suite = new SuiteSetUp();
    WebDriver driver;

    By gmailLink = By.linkText("Gmail");
    By signInButton = By.xpath("//a[normalize-space()='Sign in']");
    By emailUserName = By.name("identifier");
    By nextButton = By.xpath("//span[normalize-space()='Next']");

    @Test
    public void verifyGoogleMail() {
        driver = suite.setDriver();
        driver.get("http://www.google.com");
        driver.findElement(gmailLink).click();
        driver.findElement(signInButton).click();
        driver.findElement(emailUserName).sendKeys("bobak.samiyi@gmail.com");
        driver.findElement(nextButton).click();
        driver.get("http://www.google.com");
    }


}