package helpers;

import java.util.Set;

import org.openqa.selenium.WebElement;

import common.TestBase;

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
	
	public static boolean isElementDisplayed(WebElement element) {
		return element.isDisplayed();
	}
	
	public static boolean isElementEnabled(WebElement element) {
		return element.isEnabled();
	}
	
	public static boolean isElementSelected(WebElement element) {
		return element.isSelected();
	}
}
