package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    By signInButtonBy = By.className("login");
    By emailFieldBy = By.id("email");
    By passwordFieldBy = By.id("passwd");
    By loginButtonBy = By.id("SubmitLogin");
    By errorNotificationBy = By.xpath("//*[@id=\"center_column\"]/div[1]");
    By createEmailFieldBy = By.id("email_create");
    By createAccountButtonBy = By.id("SubmitCreate");

    public void login(String email, String password){
        clickElement(signInButtonBy);
        writeText(emailFieldBy, email);
        writeText(passwordFieldBy, password);
        clickElement(loginButtonBy);
    }
    public void navigateToRegistration(String email){
        clickElement(signInButtonBy);
        writeText(createEmailFieldBy, email);
        clickElement(createAccountButtonBy);
    }
    public void verifyFailedLogin(String expectedText){
        String error = readText(errorNotificationBy);
        assertStringEquals(error, expectedText);
    }
    public void verifyLogout(String expectedText){
        assertStringEquals(readText(signInButtonBy), expectedText);
    }
}
