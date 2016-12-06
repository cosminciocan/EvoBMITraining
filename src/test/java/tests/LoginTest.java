package tests;

import org.testng.annotations.Test;
import util.AbstractSteps;
import util.BMIConstants;

/**
 * Created by cosminciocan on 22/11/2016.
 */
@Test
public class LoginTest extends AbstractSteps{

    @Test
    public void loginWithRegularUser(){
        loginSteps.openLoginPage();
        loginSteps.typeUsername(BMIConstants.USER_NAME);
        loginSteps.typePassword(BMIConstants.USER_PASS);
        loginSteps.clickOnLoginButton();
        homePageSteps.checkLoggedIn("ReGuLar user");
    }

}
