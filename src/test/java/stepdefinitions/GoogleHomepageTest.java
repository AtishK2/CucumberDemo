package stepdefinitions;

import common.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.GoogleHomePage;

import java.util.List;

import static helpers.WebHelper.*;

public class GoogleHomepageTest extends TestBase {
	private GoogleHomePage googleHomePage;
	private String searchQuery = "best selenium tutorial";


	@Given("I launch Google Chrome browser")
	public void i_launch_google_chrome_browser() {
		launchBrowser("chrome");
	}

	@When("I open Google homepage")
	public void i_open_google_homepage() {
		openUrl("https://www.google.com/");
		googleHomePage = new GoogleHomePage(driver);
	}

	@Then("I verify that search text box is displayed")
	public void i_verify_that_search_text_box_is_displayed() {
		Assert.assertTrue(isElementDisplayed(googleHomePage.txtSearchbox));
	}

	@And("Search button is displayed")
	public void search_button_is_displayed() {
		Assert.assertTrue(isElementDisplayed(googleHomePage.btnSearch));
	}

	@And("button with text Im Feeling Lucky is displayed")
	public void button_with_text_im_feeling_lucky_is_displayed() {
		Assert.assertTrue(isElementDisplayed(googleHomePage.btnFeelingLucky));
		driver.close();
	}

	@When("enter selenium best tutorial")
	public void enter_selenium_best_tutorial() {
		enterText(googleHomePage.txtSearchbox, searchQuery);
	}

	@Then("I get a list of search results related to selenium")
	public void i_get_a_list_of_search_results() {
		System.out.println("click on Element");
		clickOnElement(googleHomePage.btnSearch);
		List<WebElement> searchResultsList = driver.findElements(By.xpath("//h3[@class='LC20lb DKV0Md']"));
		Assert.assertTrue(searchResultsList.size() > 1);
	}

	@And("page title contains search query text")
	public void page_title_contains_search_query_text() {
		Assert.assertTrue(driver.getTitle().contains(searchQuery));
		driver.close();
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
