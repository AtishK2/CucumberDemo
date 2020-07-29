package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import common.TestBase;

public class GoogleHomePage extends TestBase{

	@FindBy(name="q")
	public WebElement txtSearchbox;
	
	@FindBy(name="btnK")
	public WebElement btnSearch;
	
	@FindBy(name="btnI")
	public WebElement btnFeelingLucky;

	@FindBy(xpath="//h3[@class='LC20lb DKV0Md']")
	public List<WebElement> searchRestulsList;
	
	public GoogleHomePage() {}
	
	public GoogleHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
