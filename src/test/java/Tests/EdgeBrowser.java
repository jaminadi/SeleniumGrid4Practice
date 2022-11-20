package Tests;

import Base.Base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class EdgeBrowser extends Base {

    public WebDriver driver;

    @Test
    public void EdgeTest(){
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle() + " from Edge");
    }

    @BeforeMethod
    public void setup() throws MalformedURLException {
        driver = initializeBrowser("edge");

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}


