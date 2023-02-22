import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class VerifyLoginWIthValidCredential {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (7)\\chromedriver.exe");

        //To open new browser
        WebDriver driver=new ChromeDriver();
        //Navigate to the url
        driver.get("https://demo.actitime.com/login.do");
        //Enter Usename
        driver.findElement(By.name("username")).sendKeys("admin");
        //Enter password
        driver.findElement(By.name("pwd")).sendKeys("manager");
        //Click on Login btn
        driver.findElement(By.xpath("//div[text()='Login ']")).click();
        Thread.sleep(5000);
        //Verify the logo on home page
        List<WebElement> wb=new ArrayList<>();
        try {
             wb = driver.findElements(By.id("logo_aTretiur"));
        }
        catch (NoSuchElementException ex)
        {

        }
        finally {
            if(wb.size()>0)
            {
                if(wb.get(0).isDisplayed()) {
                    System.out.println("Test case passed");
                }
            }
            else
            {
                System.out.println("Test case failed");
            }


            driver.quit();
        }



    }
}
