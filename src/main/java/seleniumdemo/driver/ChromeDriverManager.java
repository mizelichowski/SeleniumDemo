package seleniumdemo.driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager extends DriverManager {

    @Override
    protected void createWebDriver() {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        this.driver = new ChromeDriver(options);
    }
}
