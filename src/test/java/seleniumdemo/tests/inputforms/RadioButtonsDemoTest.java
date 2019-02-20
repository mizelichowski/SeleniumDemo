package seleniumdemo.tests.inputforms;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import seleniumdemo.driver.DriverManagerFactory;
import seleniumdemo.driver.DriverType;
import seleniumdemo.pageobjects.inputforms.RadioButtonsDemo;
import seleniumdemo.tests.TestBase;

public class RadioButtonsDemoTest extends TestBase {
    private RadioButtonsDemo radioButtonsDemo;
    private final String url = "https://www.seleniumeasy.com/test/basic-radiobutton-demo.html";

    @BeforeTest
    public void init() {
        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        driver = driverManager.getWebDriver();
        radioButtonsDemo = PageFactory.initElements(driver, RadioButtonsDemo.class);
        driver.get(url);
    }

    @Parameters("type")
    @Test
    public void clickRadioButton(RadioButtonsDemo.RadioButtonSexType type) {
        radioButtonsDemo.clickRadioButton(type);
        radioButtonsDemo.clickGetCheckedValueButton();
    }

    @Parameters({"sexType", "ageGroupType"})
    @Test
    public void clickSexAndAgeGroupButtons(RadioButtonsDemo.RadioButtonSexType sexType,
                                           RadioButtonsDemo.RadioButtonAgeGroupType ageGroupType) {
        radioButtonsDemo.clickSexAndAgeGroupButtons(sexType, ageGroupType);
        radioButtonsDemo.clickGetValuesButton();
    }

}
