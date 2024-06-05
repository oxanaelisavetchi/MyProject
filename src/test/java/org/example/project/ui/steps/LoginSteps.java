package org.example.project.ui.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.project.ui.pages.LogoutPage;
import org.example.project.ui.pages.LoginPage;
import org.example.project.ui.pages.PageContext;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    WebDriver driver = new ChromeDriver();
    private LoginPage loginPage;
    private CommonSteps commanSteps;

    public LoginSteps() {
        this.loginPage = new LoginPage(driver);
        PageContext.setCurrentPage(loginPage);
    }


    @Given("user is on login page")
    public void userIsOnLoginPage() {

        String url = "https://www.saucedemo.com/v1/index.html";
        driver.get(url);

    }

    @Then("user is redirected to the home page")
    public void userIsRedirectedToTheHomePage() {
        String expectedUrl = "https://www.saucedemo22.com/v1/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);


    }

//    @When("user logs in with credentials: {}, {}")
//    public void userLogsInWithCredentials(String username, String password) {
//        loginPage.loginWithCredentials(username, password);
//    }
}



