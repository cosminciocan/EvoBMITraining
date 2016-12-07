package util;

import org.openqa.selenium.WebDriver;

import java.util.Random;

/**
 * Created by cosminciocan on 17/11/2016.
 */
public abstract class BasePage extends BMIConstants {

    public static WebDriver driver;

    static {
        startSuite();
    }

    public abstract void openPage();

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

    public int randomGenerator(int min, int max) {
        Random generator = new Random();
        return generator.nextInt((max - min) + 1) + min;
    }

}
