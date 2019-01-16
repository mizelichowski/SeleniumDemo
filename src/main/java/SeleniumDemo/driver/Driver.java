package SeleniumDemo.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.ResourceBundle;

public class Driver {
    private static String DRIVER_TYPE;

    public static String getDriverType() {
        return DRIVER_TYPE;
    }

    public static void setDriverType(String driverType) throws IOException {
        DRIVER_TYPE = loadInput();
    }

    public static String loadInput() throws IOException {
        ResourceBundle rb = ResourceBundle.getBundle("driver");
        String browser = rb.getString("driver.type");
        return browser;
    }

    protected WebDriver initializeDriver() {
        String driver = getDriverType();
        WebDriver selectedDriver = null;
        switch (driver) {
            case "Chrome":
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                WebDriver chromeDriver = new ChromeDriver();
                selectedDriver = chromeDriver;
                break;
            case "FireFox":
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
                WebDriver firefoxDriver = new FirefoxDriver();
                selectedDriver = firefoxDriver;
        }
        return selectedDriver;
    }

}
