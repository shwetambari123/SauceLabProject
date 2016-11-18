package com.saucelab;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Yogesh on 14-09-2016.
*/


public class StepDefn {
  //WebDriver driver;


    WebDriver driver ;


   public static final String Username="shwetambari123";
    public static final String Access_Key = "8272d7c7-0f84-4680-9a64-7424bbebd170";
   public static final String URL ="https://"+Username+":"+ Access_Key +"@ondemand.saucelabs.com:443/wd/hub";

   @Before
    public void openBrowser() throws MalformedURLException {
      DesiredCapabilities caps = DesiredCapabilities.chrome();
       caps.setCapability("platform","Windows XP");
       caps.setCapability("version","43.0");
        //System.setProperty("webdriver.chrome.driver","src/main/browser/chromedriver.exe");
       // driver= new ChromeDriver();
       driver = new RemoteWebDriver(new URL(URL),caps);
       driver.get("http://sbtechnos11.trial52.orangehrmlive.com/");



        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
   @After
    public void cl0seBrowser()
    {
        driver.quit();
    }

    @Given("^user is on Login page$")
    public void onLoginPage()  {
        Assert.assertTrue(driver.findElement(By.id("btnLogin")).isDisplayed());

    }

    @When("^user enter username\"([^\"]*)\" and password\"([^\"]*)\"$")
    public void doLogin(String userName, String passWord)  {

        driver.findElement(By.id("txtUsername")).sendKeys(userName);
        driver.findElement(By.id("txtPassword")).sendKeys(passWord);
        driver.findElement(By.id("btnLogin")).click();




    }

    @Then("^user can get logged in successfully$")
    public void loggedInSuccessfully(){

        Assert.assertTrue(driver.findElement(By.id("menu_pim_viewPimModule")).isEnabled());
    }



}
