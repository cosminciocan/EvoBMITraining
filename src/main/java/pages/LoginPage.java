package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.BasePage;

/**
 * Created by cosminciocan on 22/11/2016.
 */
public class LoginPage extends BasePage {

    @FindBy(id = "email")
    public WebElement userNameField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(className = "btn-primary")
    public WebElement loginButton;


    public void openPage() {
        driver.get(BASE_URL + "/authentication/login/");
    }

    public void setUserNameField(String userNameValue) {
        userNameField.sendKeys(userNameValue);
    }

    public void setPasswordField(String passwordValue) {
        passwordField.sendKeys(passwordValue);
    }

    public void clickLoginButton() {
        loginButton.click();

    }


}
