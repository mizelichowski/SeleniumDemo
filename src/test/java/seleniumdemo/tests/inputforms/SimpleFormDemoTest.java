package seleniumdemo.tests.inputforms;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;
import seleniumdemo.driver.DriverManagerFactory;
import seleniumdemo.driver.DriverType;
import seleniumdemo.pageobjects.inputforms.SimpleFormDemo;
import seleniumdemo.tests.TestBase;

public class SimpleFormDemoTest extends TestBase {
    private SimpleFormDemo simpleFormDemo;
    private final String url = "https://www.seleniumeasy.com/test/basic-first-form-demo.html";

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
        ExtentTest test = extent.createTest("First Test");
        test.log(Status.PASS, MarkupHelper.createLabel(url + " has been opened.", ExtentColor.GREEN));
        simpleFormDemo.enterMessage(message);
        simpleFormDemo.clickShowMessageButton();
        Assert.assertEquals(message, "Haha");

    }

    @Parameters({"a", "b"})
    @Test
    public void twoInputFieldsTest(String a, String b) {
        ExtentTest test = extent.createTest("Second Test");
        int aValue = Integer.parseInt(a);
        int bValue = Integer.parseInt(b);

        simpleFormDemo.enterABoxValue(a);
        test.log(Status.PASS, MarkupHelper.createLabel(a + " has been entered.", ExtentColor.GREEN));
        simpleFormDemo.enterBBoxValue(b);
        test.log(Status.PASS, MarkupHelper.createLabel(b + " has been entered.", ExtentColor.GREEN));
        simpleFormDemo.clickGetTotalBox();
        Assert.assertEquals(String.valueOf(aValue + bValue), "10");
    }
}
