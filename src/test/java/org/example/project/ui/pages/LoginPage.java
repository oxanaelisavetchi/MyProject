package org.example.project.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonPage {

    /*
    locator username Field
     */
    @FindBy(xpath = "//*[@id=\"user-name\"]")
    private WebElement usernameField;

    /*
    locator password Field
     */
    @FindBy(id = "password")
    private WebElement passwordField;
    /*
    locator  buton de logare
     */
    @FindBy(id = "login-button")
    private WebElement loginButton;
    /*
    constructor clasei,pentru initializarea fieldurilor clase
     */
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    /*
    metoda de introducere login and password
     */
    public void loginWithCredentials(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }


    @Override
    public void enterTextInField(String text, String fieldName) {
        switch (fieldName) {
            case "usernameField":
                usernameField.sendKeys(text);
                break;
            case "passwordField":
                passwordField.sendKeys(text);
                break;
            default:
                throw new IllegalArgumentException("No such field: " + fieldName);
        }
    }


    public void clickOnButton(String buttonName) {
        switch (buttonName) {
            case "loginButton":
                loginButton.click();
                break;
            default:
                throw new IllegalArgumentException("No such button: " + buttonName);

        }
    }


}
