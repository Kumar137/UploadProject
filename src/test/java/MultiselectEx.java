import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiselectEx {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (7)\\chromedriver.exe");

        //To open new browser
        WebDriver driver=new ChromeDriver();
        //Navigate to the url
        driver.get("file:///C:/Users/krshu/OneDrive/Desktop/FormDemo.html");

        WebElement wb=driver.findElement(By.xpath("//label[contains(text(),'Course')]/following-sibling::select[1]"));

        Select sel=new Select(wb);

        sel.selectByIndex(1);
        Thread.sleep(2000);
        sel.selectByVisibleText("M.Tech");
        sel.selectByValue("MBA");
        List<WebElement> lst=sel.getOptions();
        for(int i=0;i< lst.size();i++)
        {
            System.out.println(lst.get(i).getText());
        }
//        System.out.println(sel.isMultiple());
//
//        WebElement wb1=driver.findElement(By.xpath("//label[contains(text(),'Course')]/following-sibling::select[2]"));
//        Select sel1=new Select(wb1);
//        System.out.println(sel1.isMultiple());
//
//
//        sel1.selectByValue("volvo");
//        sel1.selectByIndex(1);
//        sel1.selectByVisibleText("Audi");
//
//        Thread.sleep(2000);
////        sel1.deselectByIndex(0);
////        sel1.deselectByValue("saab");
////        sel1.deselectByVisibleText("Audi");
//
////        sel1.deselectAll();
//        List<WebElement> lst=sel1.getAllSelectedOptions();
//        for(int i=0;i< lst.size();i++)
//        {
//
//            System.out.println(lst.get(i).getText());
//        }
        }
}
