package AdactinWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    WebDriver driver;

    By username = new By.ByName("username");
    By password = new By.ByName("password");
    By loginbtn = new By.ByName("login");

    public LoginPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public void login(String uname, String pass) throws InterruptedException {
        driver.findElement(username).sendKeys(uname);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginbtn).click();
        Thread.sleep(2000);
    }

    public void Logout() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.linkText("Logout")).click();
    }

}
