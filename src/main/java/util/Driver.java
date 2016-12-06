package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by cosminciocan on 16/11/2016.
 */
public class Driver {

    private static WebDriver driver;

    public static void initDriver(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        Runtime.getRuntime().addShutdownHook(new Thread(){
            public void run(){
                driver.quit();
            }
        });
    }

    public static WebDriver getDriver(){
        if (driver == null)
            initDriver();
        return driver;
    }
}
