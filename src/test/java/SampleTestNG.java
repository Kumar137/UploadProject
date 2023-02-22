import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import java.awt.*;

public class SampleTestNG {
   // @BeforeClass
    public void init()
    {
        System.out.println("Before Class");
    }

   // @BeforeMethod
    public void launch()
    {
        System.out.println("Launch Application");
    }

  //  @AfterMethod
    public void closeBrowser()
    {
        System.out.println("Close Application");
    }

    @Test(priority = 0,groups = {"ST","RT"})
    public void TestCase1()
    {
        System.out.println("In Test case 1");
    }

    @Test(priority = 1,groups = {"ST"})
    public void testCase2()
    {
        System.out.println("In Test case 2");
    }

    @Test(priority = 2,groups = {"RT"})
    public void atestCase2()
    {
        System.out.println("In Test case 3");
    }
    @Test(priority = 4,groups = {"RT"})
    public void btestCase2()
    {
        System.out.println("In Test case 4");
    }
    @Test(priority = 4,groups = {"Sanity"})
    public void btestCase3()
    {
        System.out.println("In Test case 5");
    }
    @Test(priority = 4,groups = {"Sanity"})
    public void btestCase4()
    {
        System.out.println("In Test case 6");
    }

   // @AfterClass
    public void close()
    {
        System.out.println("After class");
    }
}
