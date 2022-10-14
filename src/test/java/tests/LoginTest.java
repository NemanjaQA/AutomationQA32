package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.UserLoggedInPage;
import utilities.PropertyManager;

public class LoginTest extends BaseTest{
    @Test
    public void login(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(PropertyManager.getInstance().getGoodEmail(), PropertyManager.getInstance().getGoodPassword());
        UserLoggedInPage userLoggedInPage = new UserLoggedInPage(driver);
        userLoggedInPage.verifyLogin("Sign ou");
    }
}
