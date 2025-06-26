package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='input-firstname']")
    WebElement txtFirstName;

    @FindBy(xpath = "//input[@id='input-lastname']")
    WebElement txtLastName;

    @FindBy(xpath = "//input[@id='input-email']")
    WebElement txtEmail;

    @FindBy(xpath = "//input[@id='input-telephone']")
    WebElement txtTelephone;

    @FindBy(xpath = "//input[@id='input-password']")
    WebElement txtPassword;

    @FindBy(xpath = "//input[@id='input-confirm']")
    WebElement txtConfirmPassword;

    @FindBy(xpath = "//input[@name='agree']")
    WebElement chkdPolicy;

    @FindBy(xpath = "//input[@value='Continue']")
    WebElement btnContinue;

    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement msgConfirmation;

    public void setTxtFirstName(String fname) {
        txtFirstName.sendKeys(fname);
    }

    public void setTxtLastName(String lName) {
        txtLastName.sendKeys(lName);
    }

    public void setTxtEmail(String email) {
        txtEmail.sendKeys(email);
    }

    public void setTxtTelephone(String tel) {
        txtTelephone.sendKeys(tel);
    }

    public void setTxtPassword(String pwd) {
        txtPassword.sendKeys(pwd);
    }

    public void setTxtConfirmPassword(String pwd) {
        txtConfirmPassword.sendKeys(pwd);
    }

    public void acceptPrivacyPolicy() {
        chkdPolicy.click();
    }

    public void clickContinue() {
        btnContinue.click();
    }

    public String getConfirmationMsg() {
       try {
           return (msgConfirmation.getText());
       } catch (Exception e) {
           return (e.getMessage());
       }
    }


}
