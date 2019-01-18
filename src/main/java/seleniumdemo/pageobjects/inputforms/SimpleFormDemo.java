package seleniumdemo.pageobjects.inputforms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SimpleFormDemo {
    private WebDriver driver;

    public SimpleFormDemo(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(css = "#user-message")
    private WebElement singleInputFieldEnterMessageField;

    @FindBy(xpath = "//button[contains(text(),'Show Message')]")
    private WebElement showMessageButton;

    @FindBy(css = "#sum1")
    private WebElement enterABox;

    @FindBy(css = "#sum2")
    private WebElement enterBBox;

    @FindBy(xpath = "//button[contains(text(),'Get Total')]")
    private WebElement getTotalBox;

    public void enterMessage(String message) {
        singleInputFieldEnterMessageField.click();
        singleInputFieldEnterMessageField.clear();
        singleInputFieldEnterMessageField.sendKeys(message);
    }

    public void clickShowMessageButton() {
        showMessageButton.click();
    }

    public void enterABoxValue(String AValue) {
        enterABox.click();
        enterABox.clear();
        enterABox.sendKeys(AValue);
    }

    public void enterBBoxValue(String BValue) {
        enterBBox.click();
        enterBBox.clear();
        enterBBox.sendKeys(BValue);
    }

    public void clickGetTotalBox() {
        getTotalBox.click();
    }

}
