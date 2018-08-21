import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestHomePage {


    @Test
    public void goToBeatsPage() throws MalformedURLException {

        //WebDriver driver = new ChromeDriver();
        DesiredCapabilities capabilities= DesiredCapabilities.chrome();
        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
        HomePage homePage = new HomePage(driver);

        driver.get("https://thathrowdown.com");

        homePage.beatslinkText.click();

        driver.close();

      //Assert.assertTrue(true,driver.getTitle());
    }



}
