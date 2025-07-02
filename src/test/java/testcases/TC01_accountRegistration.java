package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testbase.BaseClass;

public class TC01_accountRegistration extends BaseClass{

    @Test
    public void validateRegistration()throws InterruptedException {
        HomePage hp = new HomePage(driver);
        hp.clickAccount();
        hp.clickRegister();

        RegisterPage registerPage = new RegisterPage(driver);

        registerPage.setTxtFirstName(randomString());
        registerPage.setTxtLastName(randomString());
        registerPage.setTxtEmail(randomString() + "@gmail.com");
        registerPage.setTxtTelephone(randomNumber());

        String pwd = randomNumber();
        registerPage.setTxtPassword(pwd);
        registerPage.setTxtConfirmPassword(pwd);
        registerPage.acceptPrivacyPolicy();
        registerPage.clickContinue();

        String confirm_msg = registerPage.getConfirmationMsg();
        Assert.assertEquals(confirm_msg, "Your Account Has Been Created!");

        Thread.sleep(3000);
    }
}
