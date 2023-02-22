package testngprogms;

import objectrepo.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PerformLogin {

    public static WebDriver driver;

    @BeforeMethod
    public void init()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (7)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");
    }
    @Test
    public void loginApp()
    {
        LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
        loginPage.login();
    }
    @Test
    public void TC2()
    {
        LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
        loginPage.login();
    }
    @AfterMethod
    public void close()
    {
        driver.quit();
    }
}
