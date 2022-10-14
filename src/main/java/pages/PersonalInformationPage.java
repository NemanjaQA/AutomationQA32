package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalInformationPage extends BasePage{
    public PersonalInformationPage(WebDriver driver) {
        super(driver);
    }
    By firstNameInputFieldBy = By.id("firstname");
    By lastNameInputFieldBy = By.id("lastname");
    By passwordInputFieldBy = By.id("old_passwd");
    By saveButtonBy = By.name("submitIdentity");
    By successMessageBy = By.xpath("//p[starts-with(@class,'alert')]");

    public void changeUsername(String fname, String lname, String password){
        writeText(firstNameInputFieldBy, fname);
        writeText(lastNameInputFieldBy, lname);
        writeText(passwordInputFieldBy, password);
        clickElement(saveButtonBy);
    }
    public void checkUsername(String fname, String lname){
        assertStringEquals(readAttribute(firstNameInputFieldBy, "value"), fname);
        assertStringEquals(readAttribute(lastNameInputFieldBy, "value"), lname);
    }
    public void verifyUsernameChange(String expectedText){
        assertStringEquals(readText(successMessageBy), expectedText);
    }
}
