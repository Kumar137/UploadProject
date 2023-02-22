import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (7)\\chromedriver.exe");

        //To open new browser
        WebDriver driver=new ChromeDriver();
//        //
        driver.get("file:///C:/Users/krshu/OneDrive/Desktop/SeleniumEx.html");

        driver.findElement(By.id("fname")).clear();
        driver.findElement(By.id("fname")).sendKeys("Kumar");

        driver.findElement(By.name("lname")).clear();
        driver.findElement(By.name("lname")).sendKeys("Testtest");

        driver.findElement(By.className("formsubmit")).click();


    }

}
