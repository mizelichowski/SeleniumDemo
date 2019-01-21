package seleniumdemo.tests.inputforms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import seleniumdemo.driver.DriverManager;
import seleniumdemo.driver.DriverManagerFactory;
import seleniumdemo.driver.DriverType;
import seleniumdemo.pageobjects.inputforms.InputFormSubmitDemo;

public class InputFormSubmitDemoTest {
    private DriverManager driverManager;
    private WebDriver driver;
    private InputFormSubmitDemo inputFormSubmitDemo;
    private String url = "https://www.seleniumeasy.com/test/input-form-demo.html";

    @BeforeTest
    public void init() {
        driverManager = DriverManagerFactory.getDriverManager(DriverType.CHROME);
        driver = driverManager.getWebDriver();
        inputFormSubmitDemo = PageFactory.initElements(driver, InputFormSubmitDemo.class);
        driver.get(url);
    }

    @Parameters({"firstName", "lastName", "email", "phone", "address", "city",
            "state", "zipCode", "website", "hosting", "description"})
    @Test
    public void fillInAllFields(String firstName, String lastName, String email,
                                String phone, String address, String city, String state,
                                String zipCode, String website, String hosting,
                                String projectDescription) {
        inputFormSubmitDemo.fillInData(firstName, lastName,
                email, phone, address, city,
                state, zipCode, website,
                hosting, projectDescription);
    }
}
