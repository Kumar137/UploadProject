package objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(xpath="//input[normalize-space(@placeholder)='Username']")
    WebElement usernameEdit;

    @FindBy(name="pwd")
    WebElement passwordEdit;

    @FindBy(xpath = "//div[text()='Login ']")
    WebElement loginBtn;

    public void login()
    {
        usernameEdit.sendKeys("admin");
        passwordEdit.sendKeys("manager");
        loginBtn.click();
    }
}
