package src.test.java.helperMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuiteSetUp {

    WebDriver driver;

    public WebDriver setDriver() {
        WebDriverManager.chromedriver().setup();
        return driver = new ChromeDriver();
    }

};


