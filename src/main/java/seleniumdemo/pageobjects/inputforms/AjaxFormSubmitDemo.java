package seleniumdemo.pageobjects.inputforms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AjaxFormSubmitDemo {
    private WebDriver driver;

    public AjaxFormSubmitDemo(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(css = "#title")
    private WebElement nameInputField;

    @FindBy(css = "#description")
    private WebElement commentInputField;

    @FindBy(css = "#btn-submit")
    private WebElement submitButton;

    @FindBy(id = "submit-control")
    private WebElement ajaxResponse;

    public void fillInTitle(String title) {
        nameInputField.clear();
        nameInputField.sendKeys(title);
    }

    public void fillInComment(String comment) {
        commentInputField.clear();
        commentInputField.sendKeys(comment);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public String getAjaxResponse() {
        return ajaxResponse.getText();
    }
}
