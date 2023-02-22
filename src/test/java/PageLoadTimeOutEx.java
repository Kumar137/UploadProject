import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PageLoadTimeOutEx {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (7)\\chromedriver.exe");

        //To open new browser
        WebDriver driver=new ChromeDriver();
        //Navigate to the url
        driver.get("https://demo.actitime.com/login.do");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.MILLISECONDS);

        //Enter Usename
        driver.findElement(By.name("username")).sendKeys("admin");
        //Enter password
        driver.findElement(By.name("pwd")).sendKeys("manager");
        //Click on Login btn
        driver.findElement(By.xpath("//div[text()='Login ']")).click();
         //Verify the logo on home page

        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.MILLISECONDS);
        WebElement  wb = driver.findElement(By.id("logo_aTretiur"));

    }

}
