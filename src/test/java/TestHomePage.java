import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage {


    @Test
    public void goToBeatsPage(){

        WebDriver driver = new ChromeDriver();

        HomePage homePage = new HomePage(driver);

        driver.get("https://thathrowdown.com");

        homePage.beatslinkText.click();

        driver.close();

      //Assert.assertTrue(true,driver.getTitle());
    }



}
