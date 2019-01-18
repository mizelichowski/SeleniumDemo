package seleniumdemo.driver;

import java.awt.*;

public class DriverManagerFactory {

    public static DriverManager getDriverManager(DriverType type) {
        DriverManager driverManager;

        switch (type) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case FIREFOX:
                driverManager = new FirefoxDriverManager();
                break;
            default:
                driverManager = new ChromeDriverManager();
                break;
        }
        return driverManager;
    }
}
