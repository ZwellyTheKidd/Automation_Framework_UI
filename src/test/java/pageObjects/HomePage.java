package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement inkMyAccount;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement inkRegister;

    public void clickAccount() {
        inkMyAccount.click();
    }

    public void clickRegister() {
        inkRegister.click();
    }
}
