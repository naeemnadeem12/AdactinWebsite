package AdactinWebsite.tests;

import AdactinWebsite.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.Driver;

public class LoginTest {

    //initialize Webdriver
    ChromeDriver driver = new ChromeDriver();
    LoginPage login;

    @BeforeClass
    public void openPage() throws InterruptedException {
        System.setProperty("webdriver.chromer.driver","C:\\Users\\wajiz.pk\\Downloads\\Chrome\\chromedriver-win32\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://adactinhotelapp.com/");
        Thread.sleep(20000);
    }

    @Test(description = "TC_LoginWithValidUser&ValidPass_001")
    public void LoginWithValidUsernameValidPassword() throws InterruptedException {
        login = new LoginPage(driver);
        login.login("naeemtester","naeemtester");
    }

    //close driver
    @AfterClass
    public void closePage(){
        driver.quit();
    }
}
