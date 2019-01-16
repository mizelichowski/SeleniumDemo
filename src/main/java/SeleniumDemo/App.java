package SeleniumDemo;

import SeleniumDemo.driver.Driver;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        Driver driver = new Driver();
        System.out.println(driver.loadInput());
    }
}
