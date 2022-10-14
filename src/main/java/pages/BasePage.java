package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver=driver;
        wait = new WebDriverWait(driver, 20);
    }
    public void waitVisibility(By elementBy){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }
    public void clickElement(By elementBy){
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }
    public void writeText(By elementBy, String text){
        waitVisibility(elementBy);
        driver.findElement(elementBy).clear();
        driver.findElement(elementBy).sendKeys(text);
    }
    public String readText(By elementBy){
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }
    public String readAttribute(By elementBy, String attribute){
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getAttribute(attribute);
    }
    public void assertStringEquals(String actualText, String expectedText){
        Assert.assertEquals(actualText,expectedText);
    }
    public void selectRandomFromDropdown(By elementBy, int x){
        Select select = new Select(driver.findElement(elementBy));
        List<WebElement> list = select.getOptions();
        int size = list.size();
        Random random = new Random();
        int selection = random.nextInt(x,size-1);
        select.selectByIndex(selection);
    }
}
