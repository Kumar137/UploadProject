import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class login {

    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (7)\\chromedriver.exe");

        //To open new browser
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");
        try {
            driver.findElement(By.xpath("//input[normalize-space(@placeholder)='Username']")).sendKeys("admin");

            driver.findElement(By.xpath("//input[contains(@placeholder,'Pass')]")).sendKeys("manager");
            driver.findElement(By.xpath("//div[text()='Login ']")).click();

        }
        catch (NoSuchElementException ex)
        {
            TakesScreenshot tk = (TakesScreenshot) driver;
            File file = tk.getScreenshotAs(OutputType.FILE);
            File destFile = new File("Desktop\\screenshot.jpeg");
            FileUtils.copyFile(file, destFile);
            System.out.println(ex.getMessage());
        }
        //driver.quit();
    }
}
