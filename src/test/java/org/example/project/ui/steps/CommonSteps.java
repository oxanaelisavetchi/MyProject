package org.example.project.ui.steps;

import io.cucumber.java.en.When;
import org.example.project.ui.pages.CommonPage;
import org.example.project.ui.pages.PageContext;
import org.openqa.selenium.WebElement;

public class CommonSteps {
    CommonPage currentPage = PageContext.getCurrentPage();

    @When("user enters {} in {}")
    public void userEntersTextInField(String text, String field) {
        currentPage.enterTextInField(text, field);
    }

    @When("user clicks on {}")
    public void userClicksOnButton(String buttonName) {
        currentPage.clickOnButton(buttonName);
    }

//    @After
//    public void closeBrowser() {
//        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@");
//        driver.quit();
//    }
}
