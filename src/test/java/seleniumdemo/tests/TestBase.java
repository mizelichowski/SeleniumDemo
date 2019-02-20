package seleniumdemo.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import seleniumdemo.driver.DriverManager;

public class TestBase {
    protected WebDriver driver;
    protected DriverManager driverManager;
    protected ExtentReports extent;
    protected ExtentHtmlReporter reporter;
    private final static String USER_DIR = "src\\resources\\extentreports\\Extent.html";

    @BeforeClass
    public void initReports() {
        extent = new ExtentReports();
        reporter = new ExtentHtmlReporter(USER_DIR);
        reporter.loadXMLConfig("src\\main\\java\\seleniumdemo\\cfg\\extent-config.xml");
        extent.attachReporter(reporter);
    }

    @AfterClass
    public void quit() {
        driver.quit();
        extent.flush();
    }
}
