package util;

import steps.AnalysisSteps;
import steps.HomePageSteps;
import steps.LoginSteps;

/**
 * Created by cosminciocan on 22/11/2016.
 */
public class AbstractSteps {

    public HomePageSteps homePageSteps = new HomePageSteps();
    public LoginSteps loginSteps = new LoginSteps();
    public AnalysisSteps analysisSteps = new AnalysisSteps();
}
