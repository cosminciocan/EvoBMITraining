package tests;

import org.testng.annotations.Test;
import steps.HomePageSteps;

/**
 * Created by cosminciocan on 17/11/2016.
 */

@Test
public class HomePageTest {
    HomePageSteps homePageSteps = new HomePageSteps();

    @Test
    public void getHomePage(){
        homePageSteps.goToHomePage();
    }
}
