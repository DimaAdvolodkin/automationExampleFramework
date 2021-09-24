package src.test.java;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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