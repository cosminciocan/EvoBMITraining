package tests;

import org.testng.annotations.Test;
import util.AbstractSteps;
import util.BMIConstants;

/**
 * Created by cosminciocan on 08/12/2016.
 */
public class AnalysisTest extends AbstractSteps {

    @Test
    public void openArticleAnalysisPage(){
        loginSteps.openLoginPage();
        loginSteps.typeUsername(BMIConstants.USER_NAME);
        loginSteps.typePassword(BMIConstants.USER_PASS);
        loginSteps.clickOnLoginButton();
        homePageSteps.checkLoggedIn("ReGuLar user");
        homePageSteps.goToAnalysisPage();
        analysisSteps.clickRandomTitle();

    }

}
