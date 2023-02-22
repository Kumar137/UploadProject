import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FollowingSibEx {

    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (7)\\chromedriver.exe");

        //To open new browser
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.findElement(By.xpath("//div[a[text()='Gmail']]/following-sibling::div[1]/a")).click();
    }
}
