package seleniumdemo.tests.inputforms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import seleniumdemo.driver.DriverManager;
import seleniumdemo.driver.DriverManagerFactory;
import seleniumdemo.driver.DriverType;
import seleniumdemo.pageobjects.inputforms.JQuerySelectDropdownDemo;

public class JQuerySelectDropdownDemoTest {
    private DriverManager driverManager;
    private WebDriver driver;
    private JQuerySelectDropdownDemo jQuerySelectDropdownDemo;
    private final String url = "https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html";

    @BeforeTest
    public void init() {
        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        driver = driverManager.getWebDriver();
        jQuerySelectDropdownDemo = PageFactory.initElements(driver, JQuerySelectDropdownDemo.class);
        driver.get(url);
    }

    @Parameters("country")
    @Test
    public void selectCountry(String country) {
        jQuerySelectDropdownDemo.selectCountry(country);
    }
}
