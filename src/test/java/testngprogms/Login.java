package testngprogms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Login {

    @Test
    public void testLogin() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (7)\\chromedriver.exe");

        //To open new browser
        WebDriver driver=new ChromeDriver();
        //Navigate to the url
        driver.get("https://demo.actitime.com");


        //driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.cssSelector(".textField")).sendKeys("admin");
        driver.findElement(By.cssSelector(".pwd")).sendKeys("manager");

      //  #loginFormContainer > tbody > tr:nth-child(1) > td > table > tbody > tr:nth-child(2) > td > input
        //driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.xpath("//div[text()='Login ']")).click();
        Thread.sleep(3000);
        List<WebElement> lst=driver.findElements(By.id("logo_aT"));
        Assert.assertNotEquals(lst.size(),1,"Logo did not appear");
        driver.quit();
    }

    @Test(dependsOnMethods = "testLogin")
    public void loginWithInvalidCondition() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (7)\\chromedriver.exe");

        //To open new browser
        WebDriver driver=new ChromeDriver();
        //Navigate to the url
        driver.get("https://demo.actitime.com");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager1");
        driver.findElement(By.xpath("//div[text()='Login ']")).click();
        Thread.sleep(3000);
        List<WebElement> str=driver.findElements(By.className("errormsg"));
        Assert.assertNotNull(str.get(0).getText(),"Error message is not present");
        driver.quit();
    }
}
