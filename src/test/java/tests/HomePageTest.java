package tests;

import org.testng.annotations.Test;
import steps.HomePageSteps;
import util.AbstractSteps;

/**
 * Created by cosminciocan on 17/11/2016.
 */

@Test
public class HomePageTest extends AbstractSteps{

    @Test
    public void getHomePage() {
        homePageSteps.goToHomePage();
    }
}
