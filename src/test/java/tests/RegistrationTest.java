package tests;

import dataGenerator.DataCreation;
import dataGenerator.RegistrationData;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegistrationPage;
import pages.UserLoggedInPage;
import utilities.PropertyManager;

public class RegistrationTest extends BaseTest {
    @Test
    public void registration(){
        LoginPage loginPage = new LoginPage(driver);
        RegistrationData registrationData = RegistrationData.generateUser();
        //String email = DataCreation.generateEmail();
        //String password = DataCreation.generatePassword();
        loginPage.navigateToRegistration(registrationData.getEmail());
        RegistrationPage registrationPage = new RegistrationPage(driver);
        /*registrationPage.registerUser(DataCreation.generateFirstName(),DataCreation.generateLastName(),
                                      password,DataCreation.generateAddress(),
                                      DataCreation.generateCity(),DataCreation.generatePostalCode(),DataCreation.generateMobile());*/
        registrationPage.registerRandomUser(registrationData);
        UserLoggedInPage userLoggedInPage = new UserLoggedInPage(driver);
        try {
            userLoggedInPage.verifyLogin("Sign out");
            PropertyManager.changeProperty("goodEmail", registrationData.getEmail());
            PropertyManager.changeProperty("goodPassword", registrationData.getPassword());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
