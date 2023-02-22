import org.testng.annotations.*;
import org.testng.annotations.Test;

public class TestNGEx2 {

    @BeforeTest
    public void beforeTestCheck()
    {
        System.out.println("In Before Test");
    }
    @Test
    public void TC05()
    {
        System.out.println("In TC06");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("In After Test");
    }

    @BeforeSuite
    public void beforesuite()
    {
        System.out.println("In Before suite");
    }
    @AfterSuite
    public void aftetresuite()
    {
        System.out.println("In After suite");
    }
}
