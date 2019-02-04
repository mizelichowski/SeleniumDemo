package seleniumdemo.pageobjects.inputforms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class JQuerySelectDropdownDemo {
    private WebDriver driver;

    @FindBy(css = "#select2-country-container")
    private WebElement selectCountryDropdown;

    @FindBy(xpath = "//ul[@class='select2-selection__rendered']")
    private WebElement selectMultipleValuesDropdown;

    @FindBy(css = "#select2-nloo-container")
    private WebElement selectUSoutlyingTerritories;

    @FindBy(css = "#files")
    private WebElement dropdownWithCategoryRelatedOptions;

    public void selectCountry(String country) {
        Select selectCountry = new Select(selectCountryDropdown);
        selectCountry.deselectAll();
        selectCountry.selectByVisibleText(country);
    }

    public void selectMultipleStates(String state) {
        Select selectMultipleStates = new Select(selectMultipleValuesDropdown);
        selectMultipleStates.selectByValue(state);
    }

    public void selectOutlyingTerritories(String territory) {
        Select selectOutlyingStates = new Select(selectUSoutlyingTerritories);
        selectOutlyingStates.selectByValue(territory);
    }

    public void selectWithCategoryRelatedOptions(String option) {
        Select selectWithCategoryRelatedOptions = new Select(dropdownWithCategoryRelatedOptions);
        selectWithCategoryRelatedOptions.selectByValue(option);
    }
}
