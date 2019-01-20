package seleniumdemo.tests.inputforms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import seleniumdemo.driver.DriverManager;
import seleniumdemo.driver.DriverManagerFactory;
import seleniumdemo.driver.DriverType;
import seleniumdemo.pageobjects.inputforms.SimpleFormDemo;

public class SimpleFormDemoTest {
    private DriverManager driverManager;
    private WebDriver driver;
    private SimpleFormDemo simpleFormDemo;
    private String url = "https://www.seleniumeasy.com/test/basic-first-form-demo.html";

    @BeforeTest
    public void init() {
        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        driver = driverManager.getWebDriver();
        simpleFormDemo = PageFactory.initElements(driver, SimpleFormDemo.class);
        driver.get(url);
    }

    @Parameters("message")
    @Test
    public void singleInputFieldTest(String message) {
        simpleFormDemo.enterMessage(message);
        simpleFormDemo.clickShowMessageButton();
        Assert.assertEquals(message, "Haha");
    }

    @Parameters({"a", "b"})
    @Test
    public void twoInputFieldsTest(String a, String b) {
        int aValue = Integer.parseInt(a);
        int bValue = Integer.parseInt(b);

        simpleFormDemo.enterABoxValue(a);
        simpleFormDemo.enterBBoxValue(b);
        simpleFormDemo.clickGetTotalBox();
        Assert.assertEquals(String.valueOf(aValue + bValue), "10");
    }
}
