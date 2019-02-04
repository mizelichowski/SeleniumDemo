package seleniumdemo.tests.inputforms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import seleniumdemo.driver.DriverManager;
import seleniumdemo.driver.DriverManagerFactory;
import seleniumdemo.driver.DriverType;
import seleniumdemo.pageobjects.inputforms.AjaxFormSubmitDemo;

// to do: validate ajax response

public class AjaxFormSubmitDemoTest {
    private DriverManager driverManager;
    private WebDriver driver;
    private AjaxFormSubmitDemo ajaxFormSubmitDemo;
    private final String url = "https://www.seleniumeasy.com/test/ajax-form-submit-demo.html";

    @BeforeTest
    public void init() {
        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        driver = driverManager.getWebDriver();
        ajaxFormSubmitDemo = PageFactory.initElements(driver, AjaxFormSubmitDemo.class);
        driver.get(url);
    }

    @Parameters({"name", "comment"})
    @Test(priority = 1)
    public void fillInFields(String name, String comment) {
        ajaxFormSubmitDemo.fillInTitle(name);
        ajaxFormSubmitDemo.fillInComment(comment);
    }

    @Test(priority = 2)
    public void ajaxResponse() {
        String response = "Form submited Successfully!";
        ajaxFormSubmitDemo.clickSubmitButton();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.textToBe(By.id("submit-control"), response));
        Assert.assertEquals(ajaxFormSubmitDemo.getAjaxResponse(), response);
    }
}
