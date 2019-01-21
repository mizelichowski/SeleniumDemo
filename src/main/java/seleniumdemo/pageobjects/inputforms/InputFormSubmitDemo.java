package seleniumdemo.pageobjects.inputforms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InputFormSubmit {
    private WebDriver driver;

    public InputFormSubmit(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement firstNameInputField;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    private WebElement lastNameInputField;

    @FindBy(xpath = "//input[@placeholder='E-Mail Address']")
    private WebElement emailInputField;

    @FindBy(xpath = "//input[@placeholder='(845)555-1212']")
    private WebElement phoneInputField;

    @FindBy(xpath = "//input[@placeholder='Address']")
    private WebElement addressInputField;

    @FindBy(xpath = "//input[@placeholder='city']")
    private WebElement cityInputField;

    @FindBy(xpath = "//select[@name='state']")
    private WebElement stateSelectionDropdown;

    @FindBy(xpath = "//input[@placeholder='Zip Code']")
    private WebElement zipCodeInputField;

    @FindBy(xpath = "//input[@placeholder='Website or domain name']")
    private WebElement websiteInputField;

    @FindBy(xpath = "//input[@value='yes']")
    private WebElement hostingNoRadioButton;

    @FindBy(xpath = "//input[@value='no']")
    private WebElement hostingYesRadioButton;

    @FindBy(xpath = "//textarea[@placeholder='Project Description']")
    private WebElement projectDescriptionInputField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement sendButton;

    public void fillInForm(String firstName, String lastName, String email, String phone, String address, String city, String state, String zipCode, String website) {

    }
}
