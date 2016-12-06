package util;

import org.openqa.selenium.WebDriver;

/**
 * Created by cosminciocan on 17/11/2016.
 */
public abstract class BasePage extends BMIConstants {

    public static WebDriver driver;

    static {
        startSuite();
    }

    private static void startSuite() {
        try {
            Driver.initDriver();
            driver = Driver.getDriver();
        } catch (Exception e) {
            System.out.println("Exception when starting the suite:\n" + e);
        }
    }

    public void sleep(int milliseconds) {

        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public abstract void openPage();
}
