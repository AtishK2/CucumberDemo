package pageobjects;

import common.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @FindBy(xpath = "//span[contains(text(),'Home')]")
    public WebElement homeMenu;

    @FindBy(xpath = "//span[contains(text(),'Contacts')]")
    public WebElement contactsMenu;

    @FindBy(xpath = "//span[contains(text(),'Deals')]")
    public WebElement dealsMenu;

    @FindBy(xpath = "//div[@role='listbox']")
    public WebElement settingsDropdown;

    @FindBy(xpath = "//span[contains(text(),'Log Out')]")
    public WebElement logoutButton;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public boolean isHomeMenuDisplayed() {
        return homeMenu.isDisplayed();
    }

    public void performLogout(){
        settingsDropdown.click();
        logoutButton.click();
    }
}
