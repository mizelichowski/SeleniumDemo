package seleniumdemo.pageobjects;

import org.openqa.selenium.WebDriver;

public class BasePageObject {
    private WebDriver driver;

    public BasePageObject(WebDriver driver) {
        this.driver = driver;
    }
}
