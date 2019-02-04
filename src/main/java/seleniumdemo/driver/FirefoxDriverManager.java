package seleniumdemo.driver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxDriverManager extends DriverManager {

    @Override
    public void createWebDriver() {
        System.setProperty("webdriver.gecko.driver", "src/resources/drivers/geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        this.driver = new FirefoxDriver(options);
    }
}
