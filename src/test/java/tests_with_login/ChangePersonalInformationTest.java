package tests_with_login;

import dataGenerator.DataCreation;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PersonalInformationPage;
import pages.UserLoggedInPage;
import utilities.PropertyManager;

public class ChangePersonalInformationTest extends BaseTestWithLogin{
    @Test
    public void changeInformation(){
        UserLoggedInPage userLoggedInPage = new UserLoggedInPage(driver);
        userLoggedInPage.navigateToPersonalInformation();
        PersonalInformationPage personalInformationPage = new PersonalInformationPage(driver);
        String fname = DataCreation.generateFirstName();
        String lname = DataCreation.generateLastName();
        personalInformationPage.changeUsername(fname, lname, PropertyManager.getInstance().getGoodPassword());
        try {
            personalInformationPage.verifyUsernameChange("Your personal information has been successfully updated.");
            PropertyManager.changeProperty("firstName", fname);
            PropertyManager.changeProperty("lastName", lname);
        }catch (AssertionError assertFail){
            Assert.fail(assertFail.toString());
        }
    }
}
