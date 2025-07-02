package testbase;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseClass {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
    }

    public String randomString(){
        String generatedString= RandomStringUtils.randomAlphabetic(5);
        return generatedString;
    }
    public String randomNumber(){
        String generatedNumber= RandomStringUtils.randomNumeric(10);
        return generatedNumber;
    }
    public String randomaAlphaNumeric(){
        String string= RandomStringUtils.randomAlphabetic(3);
        String number= RandomStringUtils.randomNumeric(3);
        return (string+"@"+number);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
