package steps;

import pages.HomePage;

/**
 * Created by cosminciocan on 17/11/2016.
 */
public class HomePageSteps {
    HomePage homePage = new HomePage();

    public void goToHomePage(){
        homePage.getHomePage();
    }
}
