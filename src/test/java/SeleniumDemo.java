import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (7)\\chromedriver.exe");

        //To open new browser
        WebDriver driver=new ChromeDriver();

        driver.get("file:///C:/Users/krshu/OneDrive/Desktop/SeleniumEx.html");

        driver.findElement(By.name("fname")).clear();
        Thread.sleep(4000);
        driver.findElement(By.name("fname")).sendKeys("testselenium");

    }
}
