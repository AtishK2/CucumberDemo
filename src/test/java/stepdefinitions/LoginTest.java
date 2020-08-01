package stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.WebHelper;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageobjects.HomePage;
import pageobjects.LoginPage;

import java.util.List;

public class LoginTest {
    String applicationUrl="https://ui.cogmento.com/";
    WebDriver driver = null;
    LoginPage loginPage;
    HomePage homePage;

    @Given("^application is already launched in browser$")
    public void application_already_launched_in_browser() throws Throwable {
        driver = WebHelper.launchBrowser("chrome", applicationUrl);
    }

    @When("^user enters correct username and password$")
    public void user_enters_correct_username_and_password(DataTable credentials) throws Throwable {
        loginPage = new LoginPage(driver);
        List<List<String>> credentialsData = credentials.raw();
        String username=credentialsData.get(0).get(0);
        String password=credentialsData.get(0).get(1);
        homePage=loginPage.performLogin(username, password);
    }

    @Then("^homepage is displayed$")
    public void homepage_is_displayed() throws Throwable {
        String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.equals("Cogmento CRM"));
        Assert.assertTrue(homePage.isHomeMenuDisplayed());
    }

    @Then("^user should be able to logout from the application$")
    public void logout_the_application() throws Throwable {
        homePage.performLogout();
        Assert.assertEquals(applicationUrl, driver.getCurrentUrl());
        driver.close();
    }
}
