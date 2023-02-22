import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DescendantEx {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (7)\\chromedriver.exe");

        //To open new browser
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");

        Thread.sleep(5000);
       // driver.findElement(By.xpath("//table[@id='loginFormContainer']/descendant::a[2]"));
    }
}
