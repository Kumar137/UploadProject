import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class AlertEx {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");

        //To open new browser
        WebDriver driver=new ChromeDriver();
        //Navigate to the url
        driver.get("https://demo.guru99.com/test/delete_customer.php");

        driver.findElement(By.name("cusid")).sendKeys("1234567");
        driver.findElement(By.name("submit")).click();

//////
        Alert alt=driver.switchTo().alert();
        Thread.sleep(1000);
       // alt.accept();
       // alt.dismiss();

        String str=alt.getText();
        if(str.equals("Do really want to delete this Customer?"))
        {
            System.out.println("test Case passed");
        }
        else
        {
            System.out.println("test Case failed");
        }
//        Thread.sleep(1000);
//
//        String str=alt.getText();
//        System.out.println(str);
//        Thread.sleep(2000);
//
//        alt.accept();


    }
}
