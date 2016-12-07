package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.BMIConstants;
import util.BasePage;

import java.util.List;

/**
 * Created by evozon on 12/7/2016.
 */
public class AnalysisPage extends BasePage {

    @FindBy(css = "h5.media-heading")
    private List<WebElement> articleTitles;

    public void openPage() {
        driver.get(BMIConstants.BASE_URL + "/dailyviewsstrategiccontent/analysis");
    }


}
