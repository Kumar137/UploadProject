import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.KeysRelatedAction;

import javax.swing.*;
import java.security.Key;

public class KeyOperation {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (7)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");

        WebElement wb=driver.findElement(By.id("username"));
        Actions act=new Actions(driver);

        act.moveToElement(wb).click().build().perform();
        act.keyDown(Keys.SHIFT).sendKeys("admin").build().perform();
//        act.keyUp(Keys.SHIFT).sendKeys("fdngkfn").build().perform();
        act.sendKeys(Keys.chord(Keys.CONTROL,"A"));

        //act.keyDown(Keys.CONTROL).keyDown((CharSequence) KeyStroke.getKeyStroke("A"));

        // act.contextClick().build().perform();

        act.doubleClick().build().perform();
    }
}
