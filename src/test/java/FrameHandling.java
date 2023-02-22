import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (7)\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/nestedframes");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        int size = driver.findElements(By.tagName("iframe")).size();

        System.out.println(size);
        //	driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");
//
        String text=driver.findElement(By.xpath("//body")).getText();
        System.out.println(text);
//
//
//        //driver.switchTo().defaultContent();
//        Thread.sleep(3000);
//
        WebElement wb=driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
        driver.switchTo().frame(wb);
//
        String text1=driver.findElement(By.xpath("//body/p")).getText();
        System.out.print(text1);
//
//        driver.switchTo().parentFrame();
//        String text2=driver.findElement(By.xpath("//body")).getText();
//        System.out.println(text2);
//
//
//        driver.quit();
    }

    //driver.switchTo.frame(1)
    //driver.switchTo.frame(frameID)
    //driver.switchTo.frame(WeBelement)
    //driver.switchTo.parent()
    //driver.switchTo.defaultContent()
}
