import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CalendarPopup {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (7)\\chromedriver.exe");

        //To open new browser
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.makemytrip.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//
//        Wait wait=new WebDriverWait(driver,TimeUnit.SECONDS.toSeconds(10));
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@class='close']"))));

       //// Thread.sleep(5000);

      //  driver.findElement(By.xpath("//a[@class='close']")).click();

        driver.findElement(By.xpath("//label[@for='departure']")).click();

        Wait wait=new WebDriverWait(driver,TimeUnit.SECONDS.toSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[div[div[text()='November 2022']]]//p[text()='24']")));
        driver.findElement(By.xpath("//div[div[div[text()='November 2022']]]//p[te   xt()='16']")).click();
    }
}
