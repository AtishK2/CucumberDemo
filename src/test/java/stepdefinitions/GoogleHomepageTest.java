package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleHomepageTest {
    WebDriver driver;

    @Given("I launch Google Chrome browser")
    public void i_launch_google_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("I open Google homepage")
    public void i_open_google_homepage() {
        driver.get("https://www.google.co.in");
    }

    @Then("I verify that search text box is displayed")
    public void i_verify_that_search_text_box_is_displayed() {
        WebElement txtSearchbox = driver.findElement(By.name("q"));
        Assert.assertTrue(txtSearchbox.isDisplayed());
    }

    @Then("Search button is displayed")
    public void search_button_is_displayed() {
        WebElement btnSearch = driver.findElement(By.name("btnK"));
        Assert.assertTrue(btnSearch.isEnabled());
    }

    @Then("button with text Im Feeling Lucky is displayed")
    public void button_with_text_im_feeling_lucky_is_displayed() {
        WebElement btnFeelingLucky = driver.findElement(By.name("btnI"));
        Assert.assertTrue(btnFeelingLucky.isEnabled());
        driver.close();
    }
}
