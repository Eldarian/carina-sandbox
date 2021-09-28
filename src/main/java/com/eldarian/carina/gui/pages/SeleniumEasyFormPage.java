package com.eldarian.carina.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SeleniumEasyFormPage extends AbstractPage {

    public SeleniumEasyFormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='user-message']")
    private ExtendedWebElement simpleForm;

    @FindBy(xpath = "//input[@id='sum1']")
    private ExtendedWebElement firstSumForm;

    @FindBy(xpath = "//input[@id='sum2']")
    private ExtendedWebElement secondSumForm;

    @FindBy(xpath = "//button[text()='Show Message']")
    private ExtendedWebElement showMessageButton;

    @FindBy(xpath = "//button[text()='Get Total']")
    private ExtendedWebElement calculateButton;

    @FindBy(id = "displayvalue")
    private ExtendedWebElement result;

    @FindBy(id = "display")
    private ExtendedWebElement message;

    @FindBy(xpath = "//a[@title='Close']")
    private ExtendedWebElement closePopupButton;

    public void closePopup() {
        closePopupButton.click();
    }

    public int getResult() {
        return Integer.parseInt(result.getText());
    }

    public void inputToSimple(String value) {
        simpleForm.type(value);
        showMessageButton.click();
    }

    public String getMessage() {
        return message.getText();
    }

    public void inputValues(int a, int b) {
        firstSumForm.type(String.valueOf(a));
        secondSumForm.type(String.valueOf(b));
        calculateButton.click();
    }
}
