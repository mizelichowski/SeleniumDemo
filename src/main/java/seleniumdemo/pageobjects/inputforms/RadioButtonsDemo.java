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

    public void clickRadioButton(String type) {
        if (type.equals("Male")) {
            maleRadioButton.click();
        }
        femaleRadioButton.click();
    }
}
