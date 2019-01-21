package seleniumdemo.pageobjects.inputforms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadioButtonsDemo {
    private WebDriver driver;

    public RadioButtonsDemo(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input")
    private WebElement maleRadioButton;

    @FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[2]/input")
    private WebElement femaleRadioButton;

    @FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[1]/input")
    private WebElement groupMaleRadioButton;

    @FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[2]/input")
    private WebElement groupFemaleRadioButton;

    @FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[1]/input")
    private WebElement zeroToFiveRadioButton;

    @FindBy(xpath = "//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[2]/input")
    private WebElement fiveToFifteenRadioButton;

    @FindBy(xpath = "//input[@value='15 - 50']")
    private WebElement fifteenToFiftyRadioButton;

    @FindBy(css = "#buttoncheck")
    private WebElement getCheckedValueButton;

    @FindBy(xpath = "//button[contains(text(),'Get values')]")
    private WebElement getValuesButton;

    public void clickRadioButton(RadioButtonSexType type) {
        if (type.equals(RadioButtonSexType.MALE)) {
            maleRadioButton.click();
        } else {
            femaleRadioButton.click();
        }
    }

    public void clickGetCheckedValueButton() {
        getCheckedValueButton.click();
    }

    public void clickSexAndAgeGroupButtons(RadioButtonSexType sexType, RadioButtonAgeGroupType ageGroupType) {
        if (sexType.equals(RadioButtonSexType.MALE)) {
            groupMaleRadioButton.click();
        } else {
            groupFemaleRadioButton.click();
        }

        if (ageGroupType.equals(RadioButtonAgeGroupType.ZERO_TO_FIVE)) {
            zeroToFiveRadioButton.click();
        } else if (ageGroupType.equals(RadioButtonAgeGroupType.FIVE_TO_FIFTEEN)) {
            fiveToFifteenRadioButton.click();
        } else {
            fifteenToFiftyRadioButton.click();
        }
    }

    public void clickGetValuesButton() {
        getValuesButton.click();
    }

    public enum RadioButtonAgeGroupType {
        ZERO_TO_FIVE,
        FIVE_TO_FIFTEEN,
        FIFTEEN_TO_FIFTY
    }

    public enum RadioButtonSexType {
        MALE,
        FEMALE
    }

}
