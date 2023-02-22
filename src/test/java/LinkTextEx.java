import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;

public class LinkTextEx {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (7)\\chromedriver.exe");

        //To open new browser
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
       // driver.findElement(By.linkText("Gmail")).click();

        //
       // driver.findElement(By.partialLinkText("Gmailopkjh")).click();

        List<WebElement> wb=driver.findElements(By.xpath("//a"));

       for(int i=0;i< wb.size();i++)
       {
     //      System.out.println(wb.get(i).getAttribute("href"));
           System.out.println(wb.get(i).getText());
       }
    }
}
