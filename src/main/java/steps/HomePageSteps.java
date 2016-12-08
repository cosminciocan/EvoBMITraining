package steps;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import util.BasePage;

/**
 * Created by cosminciocan on 17/11/2016.
 */
public class HomePageSteps {

    private HomePage homePage;

    public HomePageSteps() {
        homePage = PageFactory.initElements(BasePage.driver, HomePage.class);
    }


    public void goToHomePage() {
        homePage.openPage();
    }

    public void checkLoggedIn(String user) {
        homePage.clickMyBmi();
        Assert.assertTrue("User not logged in or incorrect user name!",
                homePage.getWelcomeText().toLowerCase().contains("welcome, " + user.toLowerCase()));
    }

    public void goToAnalysisPage(){
        homePage.clickAnalysisPage();
    }
}
