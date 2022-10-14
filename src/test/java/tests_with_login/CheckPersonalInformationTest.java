package tests_with_login;

import org.testng.annotations.Test;
import pages.PersonalInformationPage;
import pages.UserLoggedInPage;
import utilities.PropertyManager;

public class CheckPersonalInformationTest extends BaseTestWithLogin{

    @Test
    public void checkPersonalInformation(){
        UserLoggedInPage userLoggedInPage = new UserLoggedInPage(driver);
        userLoggedInPage.navigateToPersonalInformation();
        PersonalInformationPage personalInformationPage = new PersonalInformationPage(driver);
        personalInformationPage.checkUsername(PropertyManager.getInstance().getFirstName(), PropertyManager.getInstance().getLastName());
    }
}
