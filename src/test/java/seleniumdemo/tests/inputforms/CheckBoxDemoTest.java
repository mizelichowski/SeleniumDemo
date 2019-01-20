package seleniumdemo.tests.inputforms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import seleniumdemo.driver.DriverManager;
import seleniumdemo.driver.DriverManagerFactory;
import seleniumdemo.driver.DriverType;
import seleniumdemo.pageobjects.inputforms.CheckBoxDemo;

public class CheckBoxDemoTest {
    private DriverManager driverManager;
    private WebDriver driver;
    private CheckBoxDemo checkBoxDemo;
    private String url = "https://www.seleniumeasy.com/test/basic-checkbox-demo.html";

    @BeforeTest
    public void init() {
        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        driver = driverManager.getWebDriver();
        checkBoxDemo = PageFactory.initElements(driver, CheckBoxDemo.class);
        driver.get(url);
    }

    @Test
    public void tickSingleCheckbox() {
        checkBoxDemo.clickSingleCheckBox();
    }

    @Test
    public void tickAllCheckBoxes() {
        checkBoxDemo.clickCheckAllButton();
    }
}
