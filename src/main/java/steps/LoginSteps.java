package steps;

import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import util.BasePage;
import util.Driver;

/**
 * Created by cosminciocan on 22/11/2016.
 */
public class LoginSteps  {
    LoginPage loginPage;

    public LoginSteps() {
        loginPage = PageFactory.initElements(BasePage.driver, LoginPage.class);
    }

    public void openLoginPage(){
        loginPage.openPage();
    }
    public void typeUsername(String username){
        loginPage.setUserNameField(username);
    }

    public void typePassword (String password){
        loginPage.setPasswordField(password);
    }

    public void clickOnLoginButton(){
        loginPage.clickLoginButton();
    }
}
