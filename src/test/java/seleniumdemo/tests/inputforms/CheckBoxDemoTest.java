package seleniumdemo.tests.inputforms;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import seleniumdemo.driver.DriverManagerFactory;
import seleniumdemo.driver.DriverType;
import seleniumdemo.pageobjects.inputforms.CheckBoxDemo;
import seleniumdemo.tests.TestBase;

import java.util.Collections;

public class CheckBoxDemoTest extends TestBase {
    private CheckBoxDemo checkBoxDemo;
    private final String url = "https://www.seleniumeasy.com/test/basic-checkbox-demo.html";

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

    @Parameters("options")
    @Test
    public void tickCheckBoxes(CheckBoxDemo.TickOptions options) {
        checkBoxDemo.tickOptions(Collections.singletonList(options));
    }
}
