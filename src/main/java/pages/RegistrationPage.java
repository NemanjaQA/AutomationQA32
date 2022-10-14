package pages;

import dataGenerator.RegistrationData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePage{
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    By firstNameFieldBy = By.id("customer_firstname");
    By lastNameFieldBy = By.id("customer_lastname");
    By passwordFieldBy = By.id("passwd");
    By addressFieldBy = By.id("address1");
    By cityFieldBy = By.id("city");
    By postalCodeFieldBy = By.id("postcode");
    By mobilePhoneFieldBy = By.id("phone_mobile");
    By registerButtonBy = By.id("submitAccount");
    By stateDropdownBy = By.id("id_state");
    public void registerUser(String fname, String lname, String password,
                             String address, String city, String postcode, String mobile){
        writeText(firstNameFieldBy, fname);
        writeText(lastNameFieldBy, lname);
        writeText(passwordFieldBy, password);
        writeText(addressFieldBy, address);
        writeText(cityFieldBy, city);
        selectRandomFromDropdown(stateDropdownBy, 1);
        writeText(postalCodeFieldBy, postcode);
        writeText(mobilePhoneFieldBy, mobile);
        clickElement(registerButtonBy);
    }
    public void registerRandomUser(RegistrationData registrationData){
        writeText(firstNameFieldBy, registrationData.getFirstName());
        writeText(lastNameFieldBy, registrationData.getLastName());
        writeText(passwordFieldBy, registrationData.getPassword());
        writeText(addressFieldBy, registrationData.getAddress());
        writeText(cityFieldBy, registrationData.getCity());
        selectRandomFromDropdown(stateDropdownBy, 1);
        writeText(postalCodeFieldBy, registrationData.getPostalCode());
        writeText(mobilePhoneFieldBy, registrationData.getMobilePhone());
        clickElement(registerButtonBy);
    }
}
