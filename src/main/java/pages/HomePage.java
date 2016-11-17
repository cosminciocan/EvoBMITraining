package pages;

import util.BasePage;

/**
 * Created by cosminciocan on 17/11/2016.
 */
public class HomePage extends BasePage {
    public void getHomePage(){
        driver.get("https://google.com");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
