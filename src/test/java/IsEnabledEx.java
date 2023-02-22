import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.List;

public class IsEnabledEx {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (7)\\chromedriver.exe");

        //To open new browser
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/krshu/OneDrive/Desktop/FormDemo.html");
        WebElement wb=driver.findElement(By.name("firstname"));
        System.out.println(wb.isEnabled());

        System.out.println(driver.findElement(By.name("middlename")).isEnabled());

        Thread.sleep(5000);
        WebElement wb1=driver.findElement(By.xpath("//select"));
        Select sel=new Select(wb1);
        sel.selectByVisibleText("MCA");
        Thread.sleep(2000);
        sel.selectByIndex(2);
        Thread.sleep(2000);
        sel.selectByValue("M.Tech");

        List<WebElement> lst=sel.getOptions();
        for(int i=0;i< lst.size();i++)
        {
            //System.out.println(lst.get(i).getText());
            if(lst.get(i).getText().equals("BBA"))
            {
                System.out.println("Option found");
            }
        }


        //driver.quit();

    }
}
