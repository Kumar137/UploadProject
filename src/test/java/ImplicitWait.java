import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ImplicitWait {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (7)\\chromedriver.exe");


        //To open new browser
        WebDriver driver=new ChromeDriver();
        //Navigate to the url

//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demo.actitime.com/login.do");
        //Enter Usename
        driver.findElement(By.name("username")).sendKeys("admin");
        //Enter password
        driver.findElement(By.name("pwd")).sendKeys("manager");
        //Click on Login btn
        driver.findElement(By.xpath("//div[text()='Login ']")).click();

        Wait wait=new WebDriverWait(driver,TimeUnit.MILLISECONDS.toMinutes(1));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logo_aT")));

        //Verify the logo on home page
       //  WebElement  wb = driver.findElement(By.id("logo_aT"));

    }
}
