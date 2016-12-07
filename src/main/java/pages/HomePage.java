package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.BMIConstants;
import util.BasePage;

import java.util.List;

/**
 * Created by cosminciocan on 17/11/2016.
 */
public class HomePage extends BasePage {

    @FindBy(className = "icon-c-down-dir")
    private WebElement myBmiDropdown;

    @FindBy(css = ".msg.msg-top")
    private WebElement welcomeUserSpan;

    @FindBy(css = "a.span6[href*='/analysis']")
    private WebElement analysisLink;

    public void openPage() {
        driver.get(BMIConstants.BASE_URL + "/home");
    }

    public void clickMyBmi(){
        myBmiDropdown.click();
    }

    public String getWelcomeText(){
        return welcomeUserSpan.getText();
    }

    public void clickAnalysisPage(){
        analysisLink.click();
    }

}
