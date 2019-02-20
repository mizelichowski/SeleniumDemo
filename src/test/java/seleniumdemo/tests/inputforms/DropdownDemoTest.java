package seleniumdemo.tests.inputforms;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import seleniumdemo.driver.DriverManagerFactory;
import seleniumdemo.driver.DriverType;
import seleniumdemo.pageobjects.inputforms.DropdownDemo;
import seleniumdemo.tests.TestBase;

public class DropdownDemoTest extends TestBase {
    private DropdownDemo dropdownDemo;
    private final String url = "https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html";

    @BeforeTest
    public void init() {
        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        driver = driverManager.getWebDriver();
        dropdownDemo = PageFactory.initElements(driver, DropdownDemo.class);
        driver.get(url);
    }

    @Parameters("visibleText")
    @Test
    public void selectDay(String visibleText) {
        dropdownDemo.selectDayDropdownItem(visibleText);
    }

    @Parameters({"selectedValue1", "selectedValue2", "selectedValue3"})
    @Test
    public void selectFromMultiselectBox(String selectedValue1, String selectedValue2, String selectedValue3) {
        dropdownDemo.selectFromMultiSelectBox(selectedValue1, selectedValue2, selectedValue3);
        dropdownDemo.clickGetAllSelectedBox();
    }
}
