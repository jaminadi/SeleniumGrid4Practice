package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Remote;

public class Base {

    public WebDriver initializeBrowser(String browserName) throws MalformedURLException {

        WebDriver driver;
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        if(browserName.equals("chrome")){
            desiredCapabilities.setBrowserName("chrome");

        }else if(browserName.equals("firefox")){
            desiredCapabilities.setBrowserName("firefox");

        }else if(browserName.equals("edge")){
            desiredCapabilities.setBrowserName("MicrosoftEdge");

        }else if(browserName.equals("ie")){
            desiredCapabilities.setBrowserName("internet explorer");

        }else if(browserName.equals("opera")){
            desiredCapabilities.setBrowserName("opera");

        }else if(browserName.equals("safari")){
            desiredCapabilities.setBrowserName("safari");
        }
        driver = new RemoteWebDriver(new URL("http://localhost:4444"), desiredCapabilities);

        return driver;
    }
}
