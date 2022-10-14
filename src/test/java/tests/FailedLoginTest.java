package tests;

import dataGenerator.DataCreation;
import dataGenerator.DataProviders;
import listeners.ScreenshotListener;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPage;

//@Listeners(ScreenshotListener.class)
public class FailedLoginTest extends BaseTest{

    @Test(dataProvider = "failedLogin", dataProviderClass = DataProviders.class)
    public void failedLogin(String email, String password, String error) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(email, password);
        try {
            loginPage.verifyFailedLogin(error);
            System.out.println("Test passed.");
        }catch (Exception e){
            Assert.fail();
        }
    }
/*    @DataProvider(name = "failedLogin")
    public Object[][] getDataFromDataProvider(){
        return new Object[][]
                {
                        {DataCreation.generateEmail(), DataCreation.generatePassword(),"There is 1 error\nAuthentication failed."},
                        {"", DataCreation.generatePassword(),"There is 1 error\nAn email address required."},
                        {DataCreation.generateEmail(),"","There is 1 error\nPassword is required."},
                        {"","","There is 1 error\nAn email address required."}
                };
    }*/
}
