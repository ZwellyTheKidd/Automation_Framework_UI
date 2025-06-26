package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.RegisterPage;

import java.time.Duration;

public class TC01_accountRegistration {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
    }


    @Test
    public void validateRegistration() {
        HomePage hp=new HomePage(driver);
        hp.clickAccount();
        hp.clickRegister();

        RegisterPage registerPage= new RegisterPage(driver);

        registerPage.setTxtFirstName("levi");
        registerPage.setTxtLastName("jobe");
        registerPage.setTxtEmail("lev2@g.com");
        registerPage.setTxtTelephone("123456789");
        registerPage.setTxtPassword("levi123");
        registerPage.setTxtConfirmPassword("levi123");
        registerPage.acceptPrivacyPolicy();
        registerPage.clickContinue();

        String confirm_msg=registerPage.getConfirmationMsg();
        Assert.assertEquals(confirm_msg,"Your Account Has Been Created!");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
