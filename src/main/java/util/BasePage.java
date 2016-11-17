package util;

import org.openqa.selenium.WebDriver;

/**
 * Created by cosminciocan on 17/11/2016.
 */
public class BasePage {
    public static WebDriver driver;

    static{
        driver = Driver.getDriver();
    }
}
