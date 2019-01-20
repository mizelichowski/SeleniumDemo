package seleniumdemo.tests.inputforms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import seleniumdemo.driver.DriverManager;
import seleniumdemo.driver.DriverManagerFactory;
import seleniumdemo.driver.DriverType;
import seleniumdemo.pageobjects.inputforms.RadioButtonAgeGroupType;
import seleniumdemo.pageobjects.inputforms.RadioButtonSexType;
import seleniumdemo.pageobjects.inputforms.RadioButtonsDemo;

public class RadioButtonsDemoTest {
    private DriverManager driverManager;
    private WebDriver driver;
    private RadioButtonsDemo radioButtonsDemo;
    private String url = "https://www.seleniumeasy.com/test/basic-radiobutton-demo.html";

    @BeforeTest
    public void init() {
        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        driver = driverManager.getWebDriver();
        radioButtonsDemo = PageFactory.initElements(driver, RadioButtonsDemo.class);
        driver.get(url);
    }

    @Parameters("type")
    @Test
    public void clickRadioButton(RadioButtonSexType type) {
        radioButtonsDemo.clickRadioButton(type);
        radioButtonsDemo.clickGetCheckedValueButton();
    }

    @Parameters({"sexType", "ageGroupType"})
    @Test
    public void clickSexAndAgeGroupButtons(RadioButtonSexType sexType, RadioButtonAgeGroupType ageGroupType) {
        radioButtonsDemo.clickSexAndAgeGroupButtons(sexType, ageGroupType);
        radioButtonsDemo.clickGetValuesButton();
    }

}
