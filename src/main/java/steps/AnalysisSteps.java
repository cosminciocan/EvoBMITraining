package steps;

import org.openqa.selenium.support.PageFactory;
import pages.AnalysisPage;
import util.BasePage;

/**
 * Created by cosminciocan on 08/12/2016.
 */
public class AnalysisSteps {

    private AnalysisPage analysisPage;

    public void AnalysisSteps(){
        analysisPage = PageFactory.initElements(BasePage.driver,AnalysisPage.class);

    }

    public void clickRandomTitle(){
        analysisPage.clickRandomTitle();
    }

}
