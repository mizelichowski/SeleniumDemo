package seleniumdemo.pageobjects.inputforms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxDemo {
    private WebDriver driver;

    public CheckBoxDemo(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "isAgeSelected")
    private WebElement singleCheckBox;

    @FindBy(id = "check1")
    private WebElement checkAllButton;

    public void clickSingleCheckBox() {
        singleCheckBox.click();
    }

    public void clickCheckAllButton() {
        checkAllButton.click();
    }
}
