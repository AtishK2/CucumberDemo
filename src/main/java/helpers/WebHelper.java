package helpers;

import common.TestBase;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class WebHelper extends TestBase {
	public static void openUrl(String urlName) {
		driver.get(urlName);
	}
	
	public static void navigateToUrl(String urlName) {
		driver.navigate().to(urlName);
	}
	
	public static void enterText(WebElement element, String textToEnter) {
		element.clear();
		element.sendKeys(textToEnter);
	}
	
	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static Set<String> getWindows() {
		return driver.getWindowHandles();
	}
	
	public static String getWindow() {
		return driver.getWindowHandle();
	}
	
	/*public static boolean isElementDisplayed(WebElement element) {
		try{
			waitFluentlyForElement(element);
		}catch(Exception e) {
			System.out.println("Element "+element+" failed due to "+e.getMessage());
		}
		return element.isDisplayed();
	}*/
	
	public static boolean isElementEnabled(WebElement element) {
		return element.isEnabled();
	}
	
	public static boolean isElementSelected(WebElement element) {
		return element.isSelected();
	}
	
	/*public static void waitFluentlyForElement(WebElement element) {
		Wait wait=new FluentWait<WebDriver>(driver)							
				.withTimeout(Duration.ofSeconds(30)) 			
				.pollingEvery(Duration.ofSeconds(30));
		
		wait.until(new Function<WebDriver, WebElement>() {
				    public WebElement apply(WebDriver driver) {    
		        return element;    
		    }
		});
	}*/
}
