package Tests;


import Base.Base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class ChromeBrowser extends Base {

    public WebDriver driver;

    @Test
    public void ChromeTest(){
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle() + " from Chrome");
    }

    @BeforeMethod
    public void setup() throws MalformedURLException {
        driver = initializeBrowser("chrome");

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
