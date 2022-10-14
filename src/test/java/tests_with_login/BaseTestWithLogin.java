package tests_with_login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import tests.BaseTest;
import utilities.PropertyManager;

public class BaseTestWithLogin extends BaseTest {

    @Override
    @BeforeMethod
    public void setup(){
        super.setup();
        //System.setProperty("webdriver.chrome.driver", PropertyManager.getInstance().getDriverPath());

        /*WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver(new ChromeOptions().addArguments("--disable-notifications","--start-maximized"));

        driver.get("http://automationpractice.com/index.php");*/

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(PropertyManager.getInstance().getGoodEmail(),
                        PropertyManager.getInstance().getGoodPassword());
    }
}
