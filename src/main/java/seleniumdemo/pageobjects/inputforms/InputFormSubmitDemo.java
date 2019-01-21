package seleniumdemo.pageobjects.inputforms;

        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.ui.Select;

public class InputFormSubmitDemo {
    private WebDriver driver;

    public InputFormSubmitDemo(WebDriver driver) {
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
    private WebElement hostingYesRadioButton;

    @FindBy(xpath = "//input[@value='no']")
    private WebElement hostingNoRadioButton;

    @FindBy(xpath = "//textarea[@placeholder='Project Description']")
    private WebElement projectDescriptionInputField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement sendButton;

    public void fillInNameField(String name) {
        firstNameInputField.clear();
        firstNameInputField.sendKeys(name);
    }

    public void fillInLastNameField(String lastName) {
        lastNameInputField.clear();
        lastNameInputField.sendKeys(lastName);
    }

    public void fillInEmailField(String email) {
        emailInputField.clear();
        emailInputField.sendKeys(email);
    }

    public void fillInPhoneField(String phone) {
        phoneInputField.clear();
        phoneInputField.sendKeys(phone);
    }

    public void fillInAddressField(String address) {
        addressInputField.clear();
        addressInputField.sendKeys(address);
    }

    public void fillInCityField(String city) {
        cityInputField.clear();
        cityInputField.sendKeys(city);
    }

    public void selectState(String state) {
        Select select = new Select(stateSelectionDropdown);
        select.selectByVisibleText(state);
    }

    public void fillInZipCodeField(String zipCode) {
        zipCodeInputField.clear();
        zipCodeInputField.sendKeys(zipCode);
    }

    public void fillInWebsiteField(String website) {
        websiteInputField.clear();
        websiteInputField.sendKeys(website);
    }

    public void haveHosting(String hosting) {
        if (hosting.equals("true")) {
            hostingYesRadioButton.click();
        } else {
            hostingNoRadioButton.click();
        }
    }

    public void fillInProjectDesciptionField(String projectDescription) {
        projectDescriptionInputField.clear();
        projectDescriptionInputField.sendKeys(projectDescription);
    }

    public void clickSendButton() {
        sendButton.click();
    }

    public void fillInData(String name, String lastName, String email, String phone,
                           String address, String city, String state, String zipcode,
                           String website, String hosting, String projectDescription) {
        fillInNameField(name);
        fillInLastNameField(lastName);
        fillInEmailField(email);
        fillInPhoneField(phone);
        fillInAddressField(address);
        fillInCityField(city);
        selectState(state);
        fillInZipCodeField(zipcode);
        fillInWebsiteField(website);
        haveHosting(hosting);
        fillInProjectDesciptionField(projectDescription);
        clickSendButton();
    }
}
