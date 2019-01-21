package seleniumdemo.pageobjects.inputforms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {
    private WebDriver driver;

    public DropdownDemo(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(css = "#select-demo")
    private WebElement selectDayDropdown;

    @FindBy(css = "#multi-select")
    private WebElement multiSelectBox;

    @FindBy(css = "#printAll")
    private WebElement getAllSelectedBox;

    public void selectDayDropdownItem(String visibleText) {
        Select selectDay = new Select(selectDayDropdown);
        selectDay.selectByVisibleText(visibleText);
    }

    public void selectFromMultiSelectBox(String selectedValue1, String selectedValue2, String selectedValue3) {
        Select selectValues = new Select(multiSelectBox);
        selectValues.deselectAll();
        selectValues.selectByVisibleText(selectedValue1);
        selectValues.selectByVisibleText(selectedValue2);
        selectValues.selectByVisibleText(selectedValue3);
    }

    public void clickGetAllSelectedBox() {
        getAllSelectedBox.click();
    }
}