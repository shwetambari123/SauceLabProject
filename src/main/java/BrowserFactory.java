import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Yogesh on 18-11-2016.
 */



public class BrowserFactory extends BaseClass {

 /*   public static final String Username="shwetambari123";
    public static final String Access_Key = "8272d7c7-0f84-4680-9a64-7424bbebd170";
    public static final String URL ="https://"+Username+":"+ Access_Key +"@ondemand.saucelabs.com:443/wd/hub";



    public static WebDriver startBrowser() throws MalformedURLException {

        driver = startRemoteWebBrowser();
        driver.manage().window().maximize();

return  driver;
    }

public static WebDriver getDriver()
{
    return  driver;
}


public static void QuitBrowser()
{
    driver = null;
}

protected  static  WebDriver startRemoteWebBrowser() throws MalformedURLException {

    DesiredCapabilities caps = DesiredCapabilities.chrome();
    caps.setCapability("platform","Windows XP");
    caps.setCapability("version","43.0");
    // System.setProperty("webdriver.chrome.driver","src/main/browser/chromedriver.exe");
    // driver= new ChromeDriver();
    WebDriver driver = new RemoteWebDriver(new URL(URL),caps);
    driver.get("http://sbtechnos11.trial52.orangehrmlive.com/");

    return driver;
}*/

}
