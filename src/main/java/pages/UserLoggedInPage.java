package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserLoggedInPage extends BasePage{
    public UserLoggedInPage(WebDriver driver) {
        super(driver);
    }
    By signOutButtonBy = By.className("logout");
    By personalInformationButtonBy = By.xpath("//a[@title='Information']");

    public void logout(){
        clickElement(signOutButtonBy);
    }
    public void verifyLogin(String expectedText){
        assertStringEquals(readText(signOutButtonBy), expectedText);
    }
    public void navigateToPersonalInformation(){
        clickElement(personalInformationButtonBy);
    }
}
