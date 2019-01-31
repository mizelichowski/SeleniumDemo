package seleniumdemo.tests.inputforms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import seleniumdemo.driver.DriverManager;
import seleniumdemo.driver.DriverManagerFactory;
import seleniumdemo.driver.DriverType;
import seleniumdemo.pageobjects.inputforms.AjaxFormSubmitDemo;

public class AjaxFormSubmitDemoTest {
    private DriverManager driverManager;
    private WebDriver driver;
    private AjaxFormSubmitDemo ajaxFormSubmitDemo;
    private String url = "https://www.seleniumeasy.com/test/ajax-form-submit-demo.html";

    @BeforeTest
    public void init() {
        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        driver = driverManager.getWebDriver();
        ajaxFormSubmitDemo = PageFactory.initElements(driver, AjaxFormSubmitDemo.class);
        driver.get(url);
    }

    @Parameters({"name", "comment"})
    @Test
    public void fillInFields(String name, String comment) {
        ajaxFormSubmitDemo.fillInTitle(name);
        ajaxFormSubmitDemo.fillInComment(comment);
        ajaxFormSubmitDemo.clickSubmitButton();
    }
}
