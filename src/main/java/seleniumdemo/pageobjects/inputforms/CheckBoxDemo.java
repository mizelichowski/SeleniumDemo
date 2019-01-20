package seleniumdemo.pageobjects.inputforms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckBoxDemo {
    private WebDriver driver;

    public CheckBoxDemo(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "isAgeSelected")
    private WebElement singleCheckBox;

    @FindBy(xpath = "//div[@class='col-md-6 text-left']//div[2]//div[2]//div[1]//label[1]//input[1]")
    private WebElement option1Button;

    @FindBy(xpath = "//div[@class='panel-body']//div[2]//label[1]//input[1]")
    private WebElement option2Button;

    @FindBy(xpath = "//div[@class='panel-body']//div[3]//label[1]//input[1]")
    private WebElement option3Button;

    @FindBy(xpath = "//div[@class='panel-body']//div[4]//label[1]//input[1]")
    private WebElement option4Button;

    @FindBy(css = "#check1")
    private WebElement checkAllButton;

    public void clickSingleCheckBox() {
        singleCheckBox.click();
    }

    public void clickCheckAllButton() {
        checkAllButton.click();
    }

    public void tickOptions(List<TickOptions> tickOptions) {
        if(tickOptions.contains(TickOptions.OPTION1)) {
            option1Button.click();
        } else if (tickOptions.contains(TickOptions.OPTION2)) {
            option2Button.click();
        } else if (tickOptions.contains(TickOptions.OPTION3)) {
            option3Button.click();
        } else if (tickOptions.contains(TickOptions.OPTION4)) {
            option4Button.click();
        }
    }
}
