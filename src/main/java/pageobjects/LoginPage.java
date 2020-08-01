package pageobjects;

import common.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    HomePage homePage;

    @FindBy(name = "email")
    public WebElement emailTextbox;

    @FindBy(name = "password")
    public WebElement passwordTextbox;

    @FindBy(xpath = "//div[contains(text(),'Login')]")
    public WebElement loginButton;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public HomePage performLogin(String username, String password){
        emailTextbox.sendKeys(username);
        passwordTextbox.sendKeys(password);
        loginButton.click();
        homePage=new HomePage(driver);
        return homePage;
    }
}
