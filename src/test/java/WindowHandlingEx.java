import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandlingEx {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (7)\\chromedriver.exe");

        //To open new browser
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");

        driver.findElement(By.id("windowButton")).click();
        //To get set of windows ID
        Set<String> winID=driver.getWindowHandles();
        //To fetch Child and parent IDs
        Iterator itr =winID.iterator();
        String parentID= (String) itr.next();
        String childId=(String) itr.next();
        //Switch To child window
        driver.switchTo().window(childId);

        Thread.sleep(2000);

        String str=driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(str);
        //Closing Child window
        driver.close();
        //Switching back to parent window
        driver.switchTo().window(parentID);
        driver.findElement(By.id("windowButton")).click();

        //Fetch current window ID
        String winID1=driver.getWindowHandle();
        System.out.println(winID1);
    }
}
