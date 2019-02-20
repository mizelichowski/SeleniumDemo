package seleniumdemo.pageobjects;

import org.openqa.selenium.WebDriver;

public class PageObjectBase {
    private WebDriver driver;

    public PageObjectBase(WebDriver driver) {
        this.driver = driver;
    }
}
